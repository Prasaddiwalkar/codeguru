package code.codeguru.perforce;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CodingProblemTest {

    CodingProblem problem;

    @BeforeAll
    public void setup() {
        problem = new CodingProblem();
    }

    @Test
    public void testSolution() {

        problem.solution("");
    }
}
