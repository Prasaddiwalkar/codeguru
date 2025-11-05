package code.codeguru.interview.algoexpert.problems.arrays;

import java.util.ArrayList;
import java.util.List;

public class SpiralTraverse {

    // TODO spend more time to understand this problem.
    public List<Integer> spiralTraverse(int[][] array) {
        List<Integer> spiralList = new ArrayList<Integer>();

        int startRow = 0;
        int endRow = array.length - 1;
        int startColumn = 0;
        int endColumn = array[0].length - 1;

        while (startRow <= endRow && startColumn <= endColumn) {

            for (int col = startColumn; col <= endColumn; col++) {
                spiralList.add(array[startRow][col]);
            }

            for (int row = startRow + 1; row <= endRow; row++) {
                spiralList.add(array[row][endColumn]);
            }

            for (int col = endColumn - 1; col >= startColumn; col--) {
                if (startRow == endRow) break;
                spiralList.add(array[endRow][col]);
            }

            for (int row = endRow - 1; row > startRow; row--) {
                if (startColumn == endColumn) break;
                spiralList.add(array[row][startColumn]);
            }
            startRow++;
            endRow--;
            startColumn++;
            endColumn--;
        }
        return spiralList;
    }
}
