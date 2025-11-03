package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.List;

public class MoveElementToEnd {

    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        //        {
        //            "array": [2, 1, 2, 2, 2, 3, 4, 2],
        //            "toMove": 2
        //        }
        if (array == null || array.isEmpty()) {
            return List.of();
        }

        //        Collections.sort(array);
        //        array [1, 2, 2, 2, 2, 2, 3, 4]

        int startIndex = 0;
        int end = array.size() - 1;
        while (startIndex < end) {
            int temp = array.get(end);
            if (temp == toMove) {
                end--;
                continue;
            }
            if (array.get(startIndex) == toMove) {
                array.set(end, toMove);
                array.set(startIndex, temp);
                end--;
            }
            startIndex++;
        }
        return List.of();
    }
}
