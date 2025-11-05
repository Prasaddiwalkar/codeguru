package code.codeguru.interview.dsalgo.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.List;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ValidateSubsequenceTest {

    ValidateSubsequence validateSubsequence;

    @BeforeAll
    public void setup() {
        validateSubsequence = new ValidateSubsequence();
    }

    @Test
    public void setValidateSubsequence() {
        List<Integer> array = List.of(5, 1, 22, 25, 6, -1, 8, 10);
        List<Integer> sequence = List.of(1, 6, -1, 10);
        boolean result = validateSubsequence.isValidSubsequence(array, sequence);
    }
}
