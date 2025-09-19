// Interface for Taxable Products
interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

// Abstract Class Product
abstract class Product {
    private String productId;
    private String name;
    private double price;

    // Constructor
    public Product(String productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation (Getters & Setters)
    public String getProductId() { return productId; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Abstract method
    public abstract double calculateDiscount();

    // Common method
    public void displayDetails() {
        System.out.println("Product ID: " + productId + ", Name: " + name + ", Price: " + price);
    }
}

// Electronics Class
class Electronics extends Product implements Taxable {
    public Electronics(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18; // 18% GST
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax Rate: 18%";
    }
}

// Clothing Class
class Clothing extends Product implements Taxable {
    public Clothing(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // 5% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax Rate: 5%";
    }
}

// Groceries Class
class Groceries extends Product {
    public Groceries(String productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}

// Main Class
public class ECommerceDemo {
    public static void main(String[] args) {
        // Polymorphism - List of Products
        Product[] products = new Product[] {
            new Electronics("E101", "Laptop", 50000),
            new Clothing("C202", "T-Shirt", 1000),
            new Groceries("G303", "Rice Bag", 1200)
        };

        for (Product p : products) {
            p.displayDetails();
            double discount = p.calculateDiscount();

            double tax = 0;
            if (p instanceof Taxable) { // Only for taxable products
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }

            double finalPrice = p.getPrice() + tax - discount;
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("----------------------------------");
        }
    }
}