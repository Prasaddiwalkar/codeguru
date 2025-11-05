package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.List;

public class ValidateSubsequence {
    public boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {

        //        array : [1,2,3,4]
        //        sequence : [2,4]

        int seqIndex = 0;
        int arrIndex = 0;
        while (arrIndex < array.size() && seqIndex < sequence.size()) {
            if (array.get(arrIndex).equals(sequence.get(seqIndex))) {
                seqIndex++;
                if (seqIndex == sequence.size()) {
                    return true;
                }
            }
            arrIndex++;
        }
        return false;
    }
}
