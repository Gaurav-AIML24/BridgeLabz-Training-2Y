import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number for multiplication table: ");
        int number = input.nextInt();
        int[] table = new int[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = number * i;
            System.out.println(number + " * " + i + " = " + table[i - 1]);
        }
    }
}