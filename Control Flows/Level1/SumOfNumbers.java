import java.util.Scanner;
public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter number: ");
        double number = sc.nextDouble();
        while(number!=0) {
            total+=number;
            System.out.println("Enter number again: ");
            number = sc.nextDouble();
        }
        System.out.println("The total of numbers is: "+total);
    }
}
