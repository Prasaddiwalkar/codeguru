package code.codeguru.interview.perforce1;

import java.util.concurrent.ConcurrentHashMap;

public class PerforceProblem {

    //    Question:
    //    Design and implement a rate limiter in Java that enforces the following rules:
    //    Each userId is allowed N requests per second.
    //    Requests beyond the limit must be rejected.
    //    The service must be thread-safe (multiple threads can call it simultaneously).
    //    API:
    //
    //
    //    public interface RateLimiter {
    //        boolean allowRequest(String userId);
    //    }
    //    Example:
    //    For limit = 3 requests/sec
    //    If user1 sends 5 requests within 1 second → first 3 allowed, next 2 rejected.
    //            After 1 second passes, user1 can send again.

    //    public interface RateLimiter {
    ////        userId
    ////        extract the user id details
    //
    //        boolean allowRequest(String userId);
    //    }
    //
    //    public class Metadata{
    //        String userId = null;
    //        LocalDateTime datetime = LocalDateTime.now();
    //        LocalDateTime startTime = LocalDateTime.now();
    //        int counter = 5;
    //
    //        public Metadata(String userId, LocalDateTime dateTime, Object abc ){
    //            userId = userId;
    //            datetime = dateTime;
    //
    //
    //        }
    //    }
    //    public boolean allowRequest(String userId){
    //
    ////      Ingest the request metadata with timestamp in Time series data base.
    ////
    //        int limit = 5;
    //        int timeLimit = 1;
    //
    //        Map<String, Metadata> requestMetadata = new HashMap<String, Metadata>();
    //
    ////        First instance of request timestamp
    //
    ////        requestMetadata.merge(userId, )
    //
    //        Metadata userRequest = requestMetadata.getOrDefault(userId, null);
    //        if (userRequest.datetime != null){
    //
    //        }
    ////      requestMetadata.put(userId, )
    //
    //        return false;
    //    }
    //
    //

    /// /    Time series database to maintain logs of request per user.
    /// /
    //
    //    public void problem(String input) {
    //        // Solution to the Perforce problem goes here
    //        System.out.println("Solving Perforce problem...");
    //    }
    // }

    public static class SimpleRateLimiter implements RateLimiter {

        private final int maxRequestsPerSecond;
        private final ConcurrentHashMap<String, UserRequestInfo> userRequestMap =
                new ConcurrentHashMap<>();

        public SimpleRateLimiter(int maxRequestsPerSecond) {
            this.maxRequestsPerSecond = maxRequestsPerSecond;
        }

        @Override
        public boolean allowRequest(String userId) {
            long currentTimeSec = System.currentTimeMillis() / 1000;

            UserRequestInfo userInfo =
                    userRequestMap.computeIfAbsent(
                            userId, id -> new UserRequestInfo(currentTimeSec, 0));

            synchronized (userInfo) {
                // If a new second window started → reset count
                if (userInfo.timestampInSeconds != currentTimeSec) {
                    userInfo.timestampInSeconds = currentTimeSec;
                    userInfo.requestCount = 0;
                }

                if (userInfo.requestCount < maxRequestsPerSecond) {
                    userInfo.requestCount++;
                    return true;
                } else {
                    return false;
                }
            }
        }

        private static class UserRequestInfo {
            long timestampInSeconds;
            int requestCount;

            public UserRequestInfo(long timestampInSeconds, int requestCount) {
                this.timestampInSeconds = timestampInSeconds;
                this.requestCount = requestCount;
            }
        }
    }
}
