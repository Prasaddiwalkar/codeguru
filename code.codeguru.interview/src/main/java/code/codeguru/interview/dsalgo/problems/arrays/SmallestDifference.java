package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.Arrays;

public class SmallestDifference {

    public int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.

        if ((arrayOne == null || arrayOne.length == 0)
                || (arrayTwo == null || arrayTwo.length == 0)) {
            return new int[0];
        }

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        int index1 = 0;
        int index2 = 0;

        int current;
        int smallest = Integer.MAX_VALUE;
        int[] smallestPair = new int[2];

        while (index1 < arrayOne.length && index2 < arrayTwo.length) {

            int firstNum = arrayOne[index1];
            int secondNum = arrayTwo[index2];

            current = Math.abs(firstNum - secondNum);
            if (current == 0) {
                smallestPair[0] = firstNum;
                smallestPair[1] = secondNum;
                return smallestPair;
            } else if (firstNum > secondNum) {
                index2++;
            } else {
                index1++;
            }
            current = Math.min(smallest, current);

            if (smallest > current) {
                smallest = current;
                smallestPair[0] = firstNum;
                smallestPair[1] = secondNum;
            }
        }

        return smallestPair;
    }
}
