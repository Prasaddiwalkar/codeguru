package code.codeguru.interview;

public class MaximumSumSubArrayOfSizeKSW {

    // Returns the maximum sum of any contiguous subarray of size k
    public static int maxSumSubArrayOfSizeK(int[] arr, int k) {
        int maxSum = 0, windowSum = 0, windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            windowSum += arr[windowEnd];
            if (windowEnd >= k - 1) {
                maxSum = Math.max(maxSum, windowSum);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        return maxSum;
    }
}
