package code.codeguru.interview.greedy;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortTheSummaryTest {

    SortTheSummary sortSummary;

    @BeforeAll
    public void setup() {
        sortSummary = new SortTheSummary();
    }

    @Test
    public void sortTheSummaryTest() {

        int[] inputArray = {3, 3, 1, 2, 1};

        sortSummary.sortTheSummary(inputArray);
    }
}
