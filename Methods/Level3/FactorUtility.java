import java.util.Scanner;

public class FactorUtility {

    public static int[] getFactors(int number) {
        int count = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int getGreatestFactor(int[] factors) {
        int max = factors[0];
        for (int factor : factors) {
            if (factor > max) {
                max = factor;
            }
        }
        return max;
    }

    public static int getSum(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    public static long getProduct(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static double getCubeProduct(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a positive integer: ");
            int number = scanner.nextInt();

            int[] factors = getFactors(number);

            System.out.print("\nFactors of " + number + ": ");
            for (int factor : factors) {
                System.out.print(factor + " ");
            }

            System.out.println("\n\n--- Factor Analysis ---");
            System.out.println("Greatest Factor: " + getGreatestFactor(factors));
            System.out.println("Sum of Factors: " + getSum(factors));
            System.out.println("Product of Factors: " + getProduct(factors));
            System.out.printf("Product of Cubes of Factors: %.2e%n", getCubeProduct(factors));
        }
    }
}
