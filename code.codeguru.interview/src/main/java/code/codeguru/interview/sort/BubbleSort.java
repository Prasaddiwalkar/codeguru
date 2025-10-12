package code.codeguru.interview.sort;

// UBS Interview
//
public class BubbleSort {

    public void sort(int[] inputArr) {

        boolean swapped = false;
        int temp;
        for (int i = 0; i < inputArr.length; i++) {
            swapped = false;
            for (int j = 0; j < inputArr.length - i - 1; j++) {

                if (inputArr[j] > inputArr[j + 1]) {
                    temp = inputArr[j];
                    inputArr[j] = inputArr[j + 1];
                    inputArr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false) {
                break;
            }
        }
    }
}
