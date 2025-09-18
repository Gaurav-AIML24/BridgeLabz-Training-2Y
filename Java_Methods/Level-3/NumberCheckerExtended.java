public class NumberCheckerExtended {

    // Method to count digits
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int num) {
        String s = String.valueOf(num);
        int[] digits = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i) - '0';
        }
        return digits;
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += d;
        }
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) {
            sum += (int)Math.pow(d, 2);
        }
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of each digit
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[][] freq = new int[10][2];

        // Initialize digit and count = 0
        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        // Count occurrences
        for (int d : digits) {
            freq[d][1]++;
        }

        return freq;
    }
}