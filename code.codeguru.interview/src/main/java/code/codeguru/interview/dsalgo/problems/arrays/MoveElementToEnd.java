package code.codeguru.interview.dsalgo.problems.arrays;

import java.util.List;

public class MoveElementToEnd {

    public List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        if (array == null || array.isEmpty()) {
            return List.of();
        }

        int startIndex = 0;
        int end = array.size() - 1;
        int temp = 0;
        while (startIndex < end) {
            temp = array.get(end);
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
        return array;
    }
}
