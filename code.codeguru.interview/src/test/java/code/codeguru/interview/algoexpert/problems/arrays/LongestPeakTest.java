package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class LongestPeakTest {

    LongestPeak longestPeak;

    @BeforeAll
    public void setup() {
        longestPeak = new LongestPeak();
    }

    @Test
    public void setLongestPeakTest() {}
}
