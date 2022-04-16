package code.codeguru.interview.greedy;

import org.junit.Before;
import org.junit.Test;

import code.codeguru.interview.sort.BubbleSort;

public class BubbleSortTest {

	BubbleSort sort;

	@Before
	public void setup() {
		sort = new BubbleSort();
	}

	@Test
	public void bubbleSortTest() {

		int[] inputArray = { 64, 34, 25, 12, 22, 11, 90 };
		sort.sort(inputArray);

		System.out.println(inputArray);
	}

}
