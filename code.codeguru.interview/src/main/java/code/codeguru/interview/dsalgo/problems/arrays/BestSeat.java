package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BestSeat {
    public int bestSeat(int[] seats) {
        int bestSeat = -1;
        int maxSpace = 0;

        int left = 0;

        while (left < seats.length) {
            int right = left + 1;
            while (right < seats.length && seats[right] == 0) {
                right++;
            }

            int availableSpace = right - left - 1;
            if (availableSpace > maxSpace) {
                bestSeat = (left + right) / 2;
                maxSpace = availableSpace;
            }
            left = right;
        }
        return bestSeat;
    }

    public int bestSeatList(int[] seats) {
        // Write your code here.
        List<Integer> list = Arrays.stream(seats).boxed().collect(Collectors.toList());
        return -1;
    }
}
