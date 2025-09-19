import java.util.Scanner;

public class NumberChecker2 {

    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    public static int getSumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    public static double getSumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    public static boolean isHarshad(int number, int[] digits) {
        int sum = getSumOfDigits(digits);
        return number % sum == 0;
    }

    public static int[][] getDigitFrequency(int[] digits) {
        int[][] freq = new int[10][2]; 

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i; 
            freq[i][1] = 0; 
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }

        return freq;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            int digitCount = countDigits(number);
            int[] digits = getDigitsArray(number);

            System.out.println("\nDigit Count: " + digitCount);
            System.out.print("Digits Array: ");
            for (int d : digits) {
                System.out.print(d + " ");
            }

            int sum = getSumOfDigits(digits);
            double sumSquares = getSumOfSquares(digits);
            boolean harshad = isHarshad(number, digits);
            int[][] frequency = getDigitFrequency(digits);

            System.out.println("\n\nSum of Digits: " + sum);
            System.out.printf("Sum of Squares of Digits: %.2f%n", sumSquares);
            System.out.println("Harshad Number: " + (harshad ? "Yes" : "No"));

            System.out.println("\nDigit Frequency:");
            System.out.printf("%-10s %-10s%n", "Digit", "Frequency");
            for (int i = 0; i < digits.length; i++) {
                if (frequency[i][1] > 0) {
                    System.out.printf("%-10d %-10d%n", frequency[i][0], frequency[i][1]);
                }
            }
        }
    }
}
