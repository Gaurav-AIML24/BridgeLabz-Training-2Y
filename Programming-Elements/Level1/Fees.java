
import java.util.Scanner;

public class Fees {
    public static void main(String[] args) {
        int fees;
        int discountpercent;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter fees amount");
        fees = input.nextInt();
        System.out.println("Enter discount amount");
        discountpercent = input.nextInt();
        float discount = (fees * discountpercent) / 100;
        float finalfees = fees - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalfees);
        input.close();
    }
}
