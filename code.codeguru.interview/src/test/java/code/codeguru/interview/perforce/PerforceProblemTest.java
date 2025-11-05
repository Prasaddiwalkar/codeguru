package code.codeguru.interview.perforce;

import code.codeguru.interview.perforce1.PerforceProblem;
import code.codeguru.interview.perforce1.RateLimiter;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class PerforceProblemTest {

    PerforceProblem ppProblem;

    @BeforeAll
    public void setup() {
        ppProblem = new PerforceProblem();
    }

    @Test
    public void ppProblemTest() throws InterruptedException {
        RateLimiter rateLimiter = new PerforceProblem.SimpleRateLimiter(3);
        String user = "user1";

        for (int i = 1; i <= 5; i++) {
            boolean allowed = rateLimiter.allowRequest(user);
            System.out.println("Request " + i + " allowed: " + allowed);
            Thread.sleep(100);
        }

        System.out.println("Sleeping for 1.1 seconds...");
        Thread.sleep(1100);

        for (int i = 6; i <= 8; i++) {
            boolean allowed = rateLimiter.allowRequest(user);
            System.out.println("Request " + i + " allowed: " + allowed);
        }
    }
}
