import java.util.Arrays;

public class FactorsUtil {

    // Method to find factors of a number and return them as an array
    public static int[] getFactors(int num) {
        int count = 0;

        // First loop: Count factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) count++;
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop: Store factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor
    public static int greatestFactor(int[] factors) {
        int max = factors[0];
        for (int f : factors) {
            if (f > max) max = f;
        }
        return max;
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) {
            sum += f;
        }
        return sum;
    }

    // Method to find product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= f;
        }
        return product;
    }

    // Method to find product of cubes of factors
    public static long productOfCubes(int[] factors) {
        long product = 1;
        for (int f : factors) {
            product *= Math.pow(f, 3);
        }
        return product;
    }
}