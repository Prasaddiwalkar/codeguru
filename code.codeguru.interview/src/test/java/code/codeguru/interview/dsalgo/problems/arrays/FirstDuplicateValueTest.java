package code.codeguru.interview.dsalgo.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FirstDuplicateValueTest {

    FirstDuplicateValue firstDuplicateValue;

    @BeforeAll
    public void setup() {
        firstDuplicateValue = new FirstDuplicateValue();
    }

    @Test
    public void setFirstDuplicateValueTest() {
        int[] array = {2, 1, 5, 2, 3, 3, 4};
        firstDuplicateValue.firstDuplicateValue(array);
    }
}
