package code.codeguru.interview.algoexpert.problems.arrays;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] matrix) {
        // Write your code here.
        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] output = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                output[j][i] = matrix[i][j];
            }
        }
        return output;
    }
}
