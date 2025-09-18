import java.util.Scanner;

public class LargestSecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int maxDigit = 10;  
        int[] digits = new int[maxDigit];
        int index = 0;

        // Extract digits
        while (number != 0 && index < maxDigit) {
            digits[index] = number % 10;
            number /= 10;
            index++;
        }

        int largest = 0, secondLargest = 0;

        // Find largest and second largest
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("Largest digit: " + largest);
        System.out.println("Second Largest digit: " + secondLargest);

        sc.close();
    }
}