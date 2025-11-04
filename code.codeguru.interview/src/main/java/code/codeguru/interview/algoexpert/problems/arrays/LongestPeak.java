package code.codeguru.interview.algoexpert.problems.arrays;

public class LongestPeak {

    //      def longestPeak(array):
    //        longestPeakLength = 0
    //        i = 1
    //        while i < len(array) - 1:
    //          isPeak = array[i - 1] < array[i] and array[i] > array[i + 1]
    //          if not isPeak:
    //              i += 1
    //              continue
    //
    //          leftIdx = i - 2
    //          while leftIdx >= 0 and array[leftIdx] < array[leftIdx + 1]:
    //             leftIdx -= 1
    //
    //          rightIdx = i + 2
    //          while rightIdx < len(array) and array[rightIdx] < array[rightIdx - 1]:
    //             rightIdx += 1
    //
    //          currentPeakLength = rightIdx - leftIdx - 1
    //          longestPeakLength = max(longestPeakLength, currentPeakLength)
    //          i = rightIdx
    //
    //        return longestPeakLength

    public int longestPeak(int[] array) {
        // Write your code here.
        if (array == null || array.length < 3) {
            return -1;
        }

        int longestPeakLenght = 0;
        int index = 1;
        while (index < array.length - 1) {
            boolean isPeak = array[index - 1] < array[index] && array[index] > array[index + 1];
            if (!isPeak) {
                index += 1;
                continue;
            }

            int leftIndex = index - 2;
            while (leftIndex >= 0 && array[leftIndex] < array[leftIndex + 1]) {
                leftIndex -= 1;
            }

            int rightIndex = index + 2;
            while (rightIndex < array.length && array[rightIndex] < array[rightIndex - 1]) {
                rightIndex += 1;
            }
            int currentPeakLenght = rightIndex - leftIndex - 1;
            longestPeakLenght = Math.max(longestPeakLenght, currentPeakLenght);
            index = rightIndex;
        }
        return longestPeakLenght;
    }
}
