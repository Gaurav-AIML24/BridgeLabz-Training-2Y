public class Discount {
    public static void main(String[] args) {
        int fees = 125000;
        int discountpercent = 10;
        float discount = (fees * discountpercent) / 100;
        float finalfees = fees - discount;
        System.out.println("The discount amount is INR "+discount+" and final discounted fee is INR "+finalfees);
    }
}
