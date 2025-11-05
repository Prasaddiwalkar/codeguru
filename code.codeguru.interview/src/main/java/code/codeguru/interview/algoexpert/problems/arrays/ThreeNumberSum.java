package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeNumberSum {

    // Two Index solutions
    // {
    //   "array": [12, 3, 1, 2, -6, 5, 0, -8, -1, 6],
    //   "targetSum": 0
    // }
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        List<Integer[]> output = new ArrayList<>(List.of());
        //        if (array == null || array.length <= 3) {
        //            return output;
        //        }

        Arrays.sort(array);
        for (int index = 0; index <= array.length - 2; index++) {

            int leftIndex = index + 1;
            int rightIndex = array.length - 1;
            while (leftIndex < rightIndex) {
                int currentSum = array[index] + array[leftIndex] + array[rightIndex];
                if (currentSum == targetSum) {
                    Integer[] triplet =
                            new Integer[] {array[index], array[leftIndex], array[rightIndex]};
                    output.add(triplet);
                    leftIndex++;
                    rightIndex--;
                } else if (currentSum > targetSum) {
                    rightIndex--;
                } else {
                    leftIndex++;
                }
            }
        }
        return output;
    }
}
