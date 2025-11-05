package code.codeguru.interview.perforce1;

import java.time.Instant;
import java.util.concurrent.ConcurrentHashMap;

public class RateLimiterImpl implements RateLimiter {
    private final int maxToken;
    private ConcurrentHashMap<String, Integer> rateLimit = new ConcurrentHashMap<>();

    public RateLimiterImpl(int maxToken) {
        this.maxToken = maxToken;
    }

    @Override
    public boolean allowRequest(String userId) {
        //        rateLimit.computeIfAbsent(userId, )
        long currentTime = Instant.now().getNano();

        long time = Instant.now().getEpochSecond();
        //        rateLimit.computeIfAbsent(userId, id -> )
        return false;
    }
}
