package code.codeguru.interview.algoexpert.problems.arrays;

public class FirstDuplicateValue {

    //    O(n) time and O(1) space - where n is the length of the input array
    public int firstDuplicateValue(int[] array) {
        // Write your code here.
        // 2, 1, 5, 3, 3, 2, 4
        for (int value : array) {
            int absValue = Math.abs(value);
            if (array[absValue - 1] < 0) return absValue;
            array[absValue - 1] *= -1;
        }
        return -1;
    }
}
