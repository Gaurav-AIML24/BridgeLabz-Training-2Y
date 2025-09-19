import java.util.Scanner;
public class PriceCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int item,quantity;
        System.out.println("Enter price of item");
        item = input.nextInt();
        System.out.println("Enter quantity of item");
        quantity = input.nextInt();
        int totalprice = item*quantity;
        System.out.println("The total purchase price is INR "+totalprice+" if the quantity "+quantity+" and unit price is INR "+item);
        input.close();
    }
}
