package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class MissingNumbersTest {

    MissingNumbers numbers;

    @BeforeAll
    public void setup() {
        numbers = new MissingNumbers();
    }

    @Test
    public void missingNumberTest() {}
}
