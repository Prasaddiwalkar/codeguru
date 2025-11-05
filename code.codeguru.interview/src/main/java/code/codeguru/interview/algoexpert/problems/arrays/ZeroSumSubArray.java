package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.HashSet;
import java.util.Set;

public class ZeroSumSubArray {
    public boolean zeroSumSubArray(int[] nums) {

        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        int currentSum = 0;
        for (int num : nums) {
            currentSum += num;
            if (sums.contains(currentSum)) {
                return true;
            }
            sums.add(currentSum);
        }
        return false;
    }
}
