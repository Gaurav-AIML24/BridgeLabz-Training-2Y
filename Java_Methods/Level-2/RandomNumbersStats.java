import java.util.Random;

public class RandomNumbersStats {

    public static void main(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[10];

        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Generate 10 random 4-digit numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 1000 + rand.nextInt(9000); // ensures 4-digit number
            sum += numbers[i];

            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        double average = sum / 10.0;

        // Print numbers
        System.out.println("Generated Numbers:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.println("\nAverage: " + average);
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }
}