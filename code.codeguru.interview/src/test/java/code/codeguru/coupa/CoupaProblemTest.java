package code.codeguru.coupa;

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
