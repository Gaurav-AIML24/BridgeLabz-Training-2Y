public class NumberCheckerExtended3 {

    // Helper: Sum of proper divisors
    public static int sumOfProperDivisors(int num) {
        int sum = 1; // 1 is always a divisor (for num > 1)
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) sum += i;
        }
        return (num == 1) ? 0 : sum; // special case for 1
    }

    // Check if number is Perfect
    public static boolean isPerfect(int num) {
        return num > 0 && sumOfProperDivisors(num) == num;
    }

    // Check if number is Abundant
    public static boolean isAbundant(int num) {
        return num > 0 && sumOfProperDivisors(num) > num;
    }

    // Check if number is Deficient
    public static boolean isDeficient(int num) {
        return num > 0 && sumOfProperDivisors(num) < num;
    }

    // Helper: Factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Check if number is Strong
    public static boolean isStrong(int num) {
        int temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }
}