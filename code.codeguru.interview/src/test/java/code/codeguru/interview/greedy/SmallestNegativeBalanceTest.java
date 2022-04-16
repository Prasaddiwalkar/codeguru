package code.codeguru.interview.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.Before;
import org.junit.Test;

import code.codeguru.interview.greedy.SmallestNegativeBalance;

public class SmallestNegativeBalanceTest {

	SmallestNegativeBalance debt;

	@Before
	public void setup() {
		debt = new SmallestNegativeBalance();
	}

	@Test
	public void testSmallestNegativeBalance() {

		List<ArrayList<String>> input = new ArrayList<ArrayList<String>>();

		ArrayList<String> entry1 = new ArrayList<String>();

		entry1.add("Alex");
		entry1.add("Blake");
		entry1.add("5");
		input.add(entry1);

		ArrayList<String> entry2 = new ArrayList<String>();

		entry2.add("Blake");
		entry2.add("Alex");
		entry2.add("3");
		input.add(entry2);

		ArrayList<String> entry3 = new ArrayList<String>();

		entry3.add("Casey");
		entry3.add("Alex");
		entry3.add("7");
		input.add(entry3);

		ArrayList<String> entry4 = new ArrayList<String>();

		entry4.add("Casey");
		entry4.add("Alex");
		entry4.add("4");
		input.add(entry4);

		ArrayList<String> entry5 = new ArrayList<String>();

		entry5.add("Casey");
		entry5.add("Alex");
		entry5.add("2");
		input.add(entry5);

		ArrayList<String> entry6 = new ArrayList<String>();

		entry6.add("Prasad");
		entry6.add("Casey");
		entry6.add("5");
		input.add(entry6);

		System.out.println(debt.smallestNegativeBalance(input));

		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 4, 5, 6 };

		int[] thirdarray = new int[array1.length + array2.length];

//		array Copy using system.arraycopy
		System.arraycopy(array1, 0, thirdarray, 0, array1.length);
		System.arraycopy(array2, 0, thirdarray, array1.length, array2.length);

//		array copy using collections;
		List<Integer> list1 = Arrays.stream(array1).boxed().collect(Collectors.toList());

		list1.addAll(Arrays.stream(array2).boxed().collect(Collectors.toList()));

		Integer[] fourthArray = new Integer[list1.size()];
		fourthArray = list1.toArray(fourthArray);

		System.out.println();
	}

}
