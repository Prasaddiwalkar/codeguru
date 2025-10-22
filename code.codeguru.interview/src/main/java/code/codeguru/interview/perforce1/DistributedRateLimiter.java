package code.codeguru.interview.perforce1;

import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.api.RScript;
import org.redisson.Redisson;
import org.redisson.config.Config;

import java.util.Collections;

public class DistributedRateLimiter implements RateLimiter {

    private final RedissonClient redissonClient;
    private final int maxTokens;
    private final double refillRatePerSecond; // tokens/sec

    private static final String LUA_SCRIPT =
            "local key = KEYS[1] " +
            "local now = tonumber(ARGV[1]) " +
            "local refillRate = tonumber(ARGV[2]) " +
            "local maxTokens = tonumber(ARGV[3]) " +
            "local lastRefill = tonumber(redis.call('HGET', key, 'lastRefill') or 0) " +
            "local tokens = tonumber(redis.call('HGET', key, 'tokens') or maxTokens) " +
            "local delta = math.max(0, now - lastRefill) " +
            "local refill = delta * refillRate " +
            "tokens = math.min(maxTokens, tokens + refill) " +
            "if tokens >= 1 then " +
            "  tokens = tokens - 1 " +
            "  redis.call('HSET', key, 'tokens', tokens, 'lastRefill', now) " +
            "  return 1 " +
            "else " +
            "  redis.call('HSET', key, 'tokens', tokens, 'lastRefill', now) " +
            "  return 0 " +
            "end";

    public DistributedRateLimiter(int maxTokensPerSecond) {
        this.maxTokens = maxTokensPerSecond;
        this.refillRatePerSecond = maxTokensPerSecond;
        Config config = new Config();
        config.useSingleServer().setAddress("redis://localhost:6379");
        this.redissonClient = Redisson.create(config);
    }

    @Override
    public boolean allowRequest(String userId) {
        long now = System.currentTimeMillis() / 1000; // seconds
        Long result = redissonClient.getScript()
                .eval(RScript.Mode.READ_WRITE,
                        LUA_SCRIPT,
                        RScript.ReturnType.INTEGER,
                        Collections.singletonList("rate:" + userId),
                        now, refillRatePerSecond, maxTokens);
        return result == 1;
    }
}
