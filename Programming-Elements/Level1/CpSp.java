public class CpSp {
    public static void main(String[] args) {
        int costprice = 129;
        int sellingprice = 191;
        float Profit = sellingprice - costprice;
        float ProfitPercentage = Profit / costprice * 100;
        System.out.println("The Cost Price is INR 129 and Selling Price is INR 191 \n" + "The Profit is INR "+Profit+" and the Profit Percentage is "+ProfitPercentage);
    }
}
