package code.codeguru.interview.greedy;

import code.codeguru.interview.sort.BubbleSort;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BubbleSortTest {

    BubbleSort sort;

    @BeforeAll
    public void setup() {
        sort = new BubbleSort();
    }

    @Test
    public void bubbleSortTest() {

        int[] inputArray = {64, 34, 25, 12, 22, 11, 90};
        sort.sort(inputArray);

        System.out.println(inputArray);
    }
}
