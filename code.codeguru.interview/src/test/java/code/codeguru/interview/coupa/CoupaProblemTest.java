package code.codeguru.interview.coupa;

import code.codeguru.interview.coupa.CoupaProblem;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class CoupaProblemTest {

    CoupaProblem coupaProblem;

    @BeforeAll
    public void setup() {
        coupaProblem = new CoupaProblem();
    }

    @Test
    public void coupaProblemTest() {
        String input = "abcabcbb";
        coupaProblem.solution(input);
    }
}
