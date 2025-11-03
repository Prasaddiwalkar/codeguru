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

        change.nonConstructibleChange();
    }
}
