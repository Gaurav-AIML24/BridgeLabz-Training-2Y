import java.util.Scanner;
public class LargestamongThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter number3: ");
        int number3 = input.nextInt();
        boolean first = (number1>number2) && (number1>number3);
        boolean second = (number2>number1) && (number2>number3);
        boolean third = (number3>number1) && (number3>number2);
        System.out.println("Is the first number the largest? "+first+"\n"+"Is the second number the largest? "+second+"\n"+"Is the third number the largest? "+third+"\n");
        input.close();
    }
}
