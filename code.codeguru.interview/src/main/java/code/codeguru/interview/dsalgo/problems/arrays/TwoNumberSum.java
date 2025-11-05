package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoNumberSum {

    public int[] twoNumberSum(int[] array, int targetSum) {

        if (array == null || array.length < 2) {
            return new int[0];
        } else if (array.length == 2) {
            if (array[0] + array[1] == targetSum) {
                return array;
            } else {
                return new int[0];
            }
        }

        Set<Integer> inputSet = Arrays.stream(array).boxed().collect(Collectors.toSet());
        for (Integer current : inputSet) {
            int complement = targetSum - current;
            if (current == complement) {
                continue;
            } else if (inputSet.contains(complement)) {
                return new int[] {current, complement};
            }
        }

        return new int[0];
    }
}
