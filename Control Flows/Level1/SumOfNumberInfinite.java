import java.util.Scanner;
public class SumOfNumberInfinite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0.0;
        System.out.println("Enter Number: ");
        double number = sc.nextDouble();
        while(number!=0 && number>0) {
            total+=number;
            System.out.println("Enter number again: ");
            number = sc.nextDouble();
        }
        System.out.println(total);
    }
}
