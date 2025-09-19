import java.util.Scanner;
public class QuotientReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 , number2;
        System.out.println("Enter number1 and number2: ");
        number1 = input.nextInt();
        number2 = input.nextInt();
        int quotient = number1 / number2;
        int reminder = number1 % number2;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+reminder+" of two number "+number1+" and "+number2);
    }
}
