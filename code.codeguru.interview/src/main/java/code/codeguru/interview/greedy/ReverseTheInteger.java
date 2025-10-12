package code.codeguru.interview.greedy;

// UBS preperation
public class ReverseTheInteger {

    public int reverseInteger(int input) {

        int reverse = 0;
        while (input != 0) {
            int reminder = input % 10;
            reverse = reverse * 10 + reminder;
            input = input / 10;
        }
        return reverse;
    }

    public boolean isNumberPalindrome(int input) {

        //		if (new StringBuffer(String.valueOf(input)).reverse().toString().equals(input)) {
        //			return true;
        //		}

        int tempInput = input;
        int reverse = 0;
        while (tempInput != 0) {
            int reminder = tempInput % 10;
            reverse = reverse * 10 + reminder;
            tempInput = tempInput / 10;
        }
        if (tempInput == reverse) {
            return true;
        }
        return false;
    }

    public boolean isStringPalindrome(String input) {

        if (new StringBuffer(input).reverse().toString().equals(input)) {
            return true;
        }
        return false;
    }
}
