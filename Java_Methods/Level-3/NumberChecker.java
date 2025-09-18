public class NumberChecker {

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

    // Method to check Duck number
    public static boolean isDuckNumber(int num) {
        int[] digits = getDigits(num);
        for (int d : digits) {
            if (d == 0) return true;
        }
        return false;
    }

    // Method to check Armstrong number
    public static boolean isArmstrong(int num) {
        int[] digits = getDigits(num);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) {
            sum += Math.pow(d, n);
        }
        return sum == num;
    }

    // Find largest and second largest digits
    public static void findLargestTwo(int[] digits) {
        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > first) {
                second = first;
                first = d;
            } else if (d > second && d != first) {
                second = d;
            }
        }
        System.out.println("Largest digit: " + first + ", Second largest: " + second);
    }

    // Find smallest and second smallest digits
    public static void findSmallestTwo(int[] digits) {
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < first) {
                second = first;
                first = d;
            } else if (d < second && d != first) {
                second = d;
            }
        }
        System.out.println("Smallest digit: " + first + ", Second smallest: " + second);
    }

    // Method to find sum of digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Method to find sum of squares of digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Method to check Harshad number
    public static boolean isHarshad(int num) {
        int[] digits = getDigits(num);
        int sum = sumOfDigits(digits);
        return num % sum == 0;
    }

    // Method to find frequency of digits
    public static void digitFrequency(int num) {
        int[] digits = getDigits(num);
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int d : digits) {
            freq[d][1]++;
        }

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i][1] > 0) {
                System.out.println(freq[i][0] + " -> " + freq[i][1]);
            }
        }
    }
}