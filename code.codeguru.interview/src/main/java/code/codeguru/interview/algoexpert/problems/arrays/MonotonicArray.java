package code.codeguru.interview.algoexpert.problems.arrays;

public class MonotonicArray {

    // "array": [-1, -5, -10, -1100, -1100, -1101, -1102, -9001]
    public boolean isMonotonit(int[] array) {

        if (array == null || array.length <= 1) {
            return true;
        }

        boolean isIncreasing = true;
        boolean isDecreasing = true;

        for (int index = 1; index < array.length; index++) {
            if (array[index] > array[index - 1]) {
                isIncreasing = false;
            }

            if (array[index] < array[index - 1]) {
                isDecreasing = false;
            }
        }

        return isIncreasing || isDecreasing;
    }
}
