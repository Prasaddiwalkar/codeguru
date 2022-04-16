package code.codeguru.interview.greedy;

import org.junit.Before;
import org.junit.Test;

public class SortTheSummaryTest {

	SortTheSummary sortSummary;

	@Before
	public void setup() {
		sortSummary = new SortTheSummary();
	}

	@Test
	public void sortTheSummaryTest() {

		int[] inputArray = { 3, 3, 1, 2, 1 };

		sortSummary.sortTheSummary(inputArray);
	}

}
