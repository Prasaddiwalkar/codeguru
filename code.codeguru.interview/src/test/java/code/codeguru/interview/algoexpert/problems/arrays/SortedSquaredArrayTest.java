package code.codeguru.interview.algoexpert.problems.arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SortedSquaredArrayTest {
    SortedSquaredArray sortedSquaredArray;

    @BeforeAll
    public void setup() {
        sortedSquaredArray = new SortedSquaredArray();
    }

    @Test
    public void testSortedSquaredArray() {
        int[] input = {1};
        int[] result = sortedSquaredArray.sortedSquaredArray(input);
        System.out.print(result);
    }
}
