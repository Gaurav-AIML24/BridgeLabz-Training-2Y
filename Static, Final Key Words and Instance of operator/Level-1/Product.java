public class Product {
    private static double discount = 10.0; // percentage

    private final String productID;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productName, double price, int quantity, String productID) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.productID = productID;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }

    public static void main(String[] args) {
        Product product = new Product("Laptop", 1200.0, 5, "P1001");
        if (product instanceof Product) {
            product.displayDetails();
        } else {
            System.out.println("Object is not an instance of Product");
        }
        Product.updateDiscount(15.0);
        System.out.println("Updated Discount: " + discount + "%");
    }
}
