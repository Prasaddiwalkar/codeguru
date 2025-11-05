package code.codeguru.interview.dsalgo.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TwoNumberSumTest {

    TwoNumberSum twoNumberSum;

    @BeforeAll
    public void setup() {
        twoNumberSum = new TwoNumberSum();
    }

    @Test
    public void testTwoNumberSum() {
        int[] input = {3, 5, -4, 8, 11, 1, -1, 6};
        int targetSum = 10;
        int[] result = twoNumberSum.twoNumberSum(input, targetSum);
    }
}
