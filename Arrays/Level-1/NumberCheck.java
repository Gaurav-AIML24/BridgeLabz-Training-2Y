import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Check each number
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive Even");
                } else {
                    System.out.println(num + " is Positive Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }

        // Compare first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and Last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is greater than Last element.");
        } else {
            System.out.println("First element is less than Last element.");
        }
    }
}