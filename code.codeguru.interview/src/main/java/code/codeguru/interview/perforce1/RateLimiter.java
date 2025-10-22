package code.codeguru.interview.perforce1;

public interface RateLimiter {
//        userId
//        extract the user id details
        boolean allowRequest(String userId);
    }
