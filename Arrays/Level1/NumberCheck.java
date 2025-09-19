import java.util.Scanner;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println(num + " is Positive and Even");
                } else {
                    System.out.println(num + " is Positive and Odd");
                }
            } else if (num < 0) {
                System.out.println(num + " is Negative");
            } else {
                System.out.println(num + " is Zero");
            }
        }
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("First and last elements are Equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("First element is Greater than last.");
        } else {
            System.out.println("First element is Less than last.");
        }
        sc.close();
    }
}
