package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.Arrays;

public class NonConstructibleChange {
    public int nonConstructibleChange(int[] coins) {

        // {
        //   "coins": [5, 7, 1, 1, 2, 3, 22]
        // }

        if (coins == null || coins.length == 0) {
            return 1;
        }
        // Sort coins
        Arrays.sort(coins);
        int currentChange = 0;

        for (int coin : coins) {
            int nonConstructibleChange = currentChange + 1;
            if (coin > nonConstructibleChange) {
                return nonConstructibleChange;
            }
            currentChange += coin;
        }

        return currentChange + 1;
    }
}
