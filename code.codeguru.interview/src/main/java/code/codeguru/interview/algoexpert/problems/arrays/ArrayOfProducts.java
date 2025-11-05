package code.codeguru.interview.algoexpert.problems.arrays;

public class ArrayOfProducts {
    public int[] arrayOfProducts1(int[] array) {

        if (array == null || array.length == 0) return new int[0];
        int size = array.length;
        int[] output = new int[size];
        output[0] = 1;

        for (int i = 1; i < size; i++) {
            output[i] = array[i - 1] * output[i - 1];
        }

        int prev = 1;
        for (int j = size - 2; j >= 0; j--) {
            prev *= array[j + 1];
            output[j] *= prev;
        }
        return output;
    }

    public int[] arrayOfProducts2(int[] array) {
        int n = array.length;
        int[] products = new int[n];

        for (int i = 0; i < n; i++) {
            int runningProduct = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    runningProduct *= array[j];
                }
            }
            products[i] = runningProduct;
        }
        return products;
    }
}
