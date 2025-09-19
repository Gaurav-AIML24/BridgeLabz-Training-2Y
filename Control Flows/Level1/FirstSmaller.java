import java.util.Scanner;
public class FirstSmaller {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        System.out.println("Enter number3: ");
        int number3 = input.nextInt();
        boolean isSmallest = (number1<number2) && (number1<number3);
        System.out.println("Is the first number the smallest? "+isSmallest);
        input.close();
    }
}
