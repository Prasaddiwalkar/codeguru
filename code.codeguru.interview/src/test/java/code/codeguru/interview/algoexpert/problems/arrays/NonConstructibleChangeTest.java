package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class NonConstructibleChangeTest {

    NonConstructibleChange change;

    @BeforeAll
    public void setup() {
        change = new NonConstructibleChange();
    }

    @Test
    public void nonConstructibleChangeTest() {

        int[] coins = {5, 7, 1, 1, 2, 3, 22};
        change.nonConstructibleChange(coins);
    }
}
