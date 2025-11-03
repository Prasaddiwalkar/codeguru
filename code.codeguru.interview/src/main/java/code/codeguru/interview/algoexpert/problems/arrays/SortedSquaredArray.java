package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.Arrays;

public class SortedSquaredArray {

    //  Write a function that takes in a non-empty array of integers that are sorted
    //  in ascending order and returns a new array of the same length with the squares
    //  of the original integers also sorted in ascending order.

    public int[] sortedSquaredArray(int[] array) {

        if (array == null || array.length == 0) {
            return new int[0];
        } else if (array.length == 1) {
            return new int[] {(int) Math.pow(array[0], 2)};
        }
        int[] powArray = new int[array.length];
        for (int index = 0; index < array.length - 1; index++) {
            powArray[index] = (int) Math.pow(array[index], 2);
        }
        Arrays.sort(powArray);
        return powArray;
    }
}
