import java.util.Scanner;

public class NumberChecker1 {

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

    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { 
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isArmstrong(int number, int[] digits) {
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    public static int[] findTwoLargest(int[] digits) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2 && digit != max1) {
                max2 = digit;
            }
        }

        return new int[]{max1, max2};
    }

    public static int[] findTwoSmallest(int[] digits) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < min1) {
                min2 = min1;
                min1 = digit;
            } else if (digit < min2 && digit != min1) {
                min2 = digit;
            }
        }

        return new int[]{min1, min2};
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

            System.out.println("\nDuck Number: " + (isDuckNumber(digits) ? "Yes" : "No"));
            System.out.println("Armstrong Number: " + (isArmstrong(number, digits) ? "Yes" : "No"));

            int[] largest = findTwoLargest(digits);
            System.out.println("Largest Digit: " + largest[0]);
            System.out.println("Second Largest Digit: " + (largest[1] != Integer.MIN_VALUE ? largest[1] : "None"));

            int[] smallest = findTwoSmallest(digits);
            System.out.println("Smallest Digit: " + smallest[0]);
            System.out.println("Second Smallest Digit: " + (smallest[1] != Integer.MAX_VALUE ? smallest[1] : "None"));
        }
    }
}
