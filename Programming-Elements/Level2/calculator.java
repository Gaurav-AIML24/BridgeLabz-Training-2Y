import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        double number1 = input.nextDouble();
        System.out.println("Enter second number");
        double number2 = input.nextDouble();
        double Addition = number1 + number2;
        double Subtraction = number1 - number2;
        double Multiplication = number1 * number2;
        double Division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+ " and "+number2+" is "+Addition+" , "+Subtraction+" , "+Multiplication+" and "+Division);
        input.close();
    }
}