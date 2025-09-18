import java.util.Scanner;

public class MultiTables6to9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] results = new int[4]; // store results for 6 to 9

        for (int i = 6; i <= 9; i++) {
            int result = number * i;
            results[i - 6] = result;
            System.out.println(number + " * " + i + " = " + result);
        }
    }
}