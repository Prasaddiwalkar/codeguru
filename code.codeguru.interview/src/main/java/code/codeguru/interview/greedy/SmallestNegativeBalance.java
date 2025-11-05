package code.codeguru.interview.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// UBS preparation
// KLA interview
public class SmallestNegativeBalance {

    /**
     * Calculates the list of people with the smallest negative balance after processing all debts.
     * Each debt is represented as an ArrayList of Strings: [debtor, creditor, amount]. If nobody
     * has a negative balance, returns a list with "Nobody has a negative balance".
     *
     * @param debts List of debts, where each debt is a list: [debtor, creditor, amount]
     * @return Sorted list of names with the smallest negative balance, or a list with a single
     *     message
     */
    public List<String> smallestNegativeBalance(List<ArrayList<String>> debts) {

        Map<String, Integer> smallestNegativeMap = new HashMap<String, Integer>();

        // Process each debt: update balances for debtor and creditor
        debts.forEach(
                (debt) -> {
                    // Increase creditor's balance by the debt amount
                    smallestNegativeMap.put(
                            debt.get(1),
                            smallestNegativeMap.getOrDefault(debt.get(1), 0)
                                    + Integer.parseInt(debt.get(2)));
                    // Decrease debtor's balance by the debt amount
                    smallestNegativeMap.put(
                            debt.get(0),
                            smallestNegativeMap.getOrDefault(debt.get(0), 0)
                                    - Integer.parseInt(debt.get(2)));
                });

        // Find the minimum balance
        int min = Collections.min(smallestNegativeMap.values());

        List<String> output = new ArrayList<String>();

        // If no one has a negative balance, return the message
        if (Collections.frequency(smallestNegativeMap.values(), min) <= 0) {
            output.add("Nobody has a negative balance");
            return output;
        }

        // Collect all names with the minimum balance
        smallestNegativeMap.forEach(
                (key, value) -> {
                    if (value == min) {
                        output.add(key);
                    }
                });

        Collections.sort(output);
        return output;
    }

    public List<String> smallestNegativeBalanceBiFunction(List<ArrayList<String>> debts) {

        if (debts == null || debts.size() == 0) {
            return List.of("Nobody has a negative balance");
        }

        Map<String, Integer> smallestNegativeMap = new HashMap<String, Integer>();

        // Process each debt: update balances for debtor and creditor
        debts.forEach(
                (debt) -> {
                    String debater = debt.get(0);
                    String creditor = debt.get(1);
                    int amount = Integer.parseInt(debt.get(2));
                    // Increase creditor's balance by the debt amount
                    smallestNegativeMap.merge(creditor, amount, Integer::sum);
                    // Decrease debtor's balance by the debt amount
                    smallestNegativeMap.merge(debater, -amount, Integer::sum);
                });

        // Find the minimum balance
        int min = Collections.min(smallestNegativeMap.values());

        // If no one has a negative balance, return the message
        if (Collections.frequency(smallestNegativeMap.values(), min) <= 0) {
            return List.of("Nobody has a negative balance");
        }

        List<String> output = new ArrayList<String>();
        // Collect all names with the minimum balance
        smallestNegativeMap.forEach(
                (key, value) -> {
                    if (value == min) {
                        output.add(key);
                    }
                });

        Collections.sort(output);
        return output;
    }
}
