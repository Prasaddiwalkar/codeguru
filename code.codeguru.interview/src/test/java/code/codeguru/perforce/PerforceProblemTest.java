package code.codeguru.perforce;

import code.codeguru.coupa.CoupaProblem;
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
    public void ppProblemTest() {
        String input = "abcabcbb";
        ppProblem.problem(input);
    }
}
