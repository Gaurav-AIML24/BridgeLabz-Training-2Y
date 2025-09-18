public class NumberCheckerExtended1 {

    // Method to count digits in the number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of the number in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays
    public static boolean arraysEqual(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Method to check if a number is Palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigits(num);
        int[] reversed = reverseDigits(digits);
        return arraysEqual(digits, reversed);
    }

    // Method to check if a number is Duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }
}