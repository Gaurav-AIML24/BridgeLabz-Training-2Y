// Interface for Deliverable
interface Deliverable {
    int calculateDeliveryTime();   // in minutes
    double calculateDeliveryCharge(); 
}

// Abstract class FoodItem
abstract class FoodItem {
    private String itemId;
    private String name;
    private double price;

    // Constructor
    public FoodItem(String itemId, String name, double price) {
        this.itemId = itemId;
        this.name = name;
        this.price = price;
    }

    // Encapsulation (Getters)
    public String getItemId() { return itemId; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    // Abstract method
    public abstract String getCategory();

    // Concrete method (Polymorphic)
    public void displayItemDetails() {
        System.out.println("Item ID: " + itemId +
                           ", Name: " + name +
                           ", Price: $" + price +
                           ", Category: " + getCategory());
    }
}

// Subclass Pizza
class Pizza extends FoodItem implements Deliverable {
    private String size;

    public Pizza(String itemId, String name, double price, String size) {
        super(itemId, name, price);
        this.size = size;
    }

    @Override
    public String getCategory() {
        return "Pizza (" + size + ")";
    }

    @Override
    public int calculateDeliveryTime() {
        return 30; // minutes
    }

    @Override
    public double calculateDeliveryCharge() {
        return 50.0; // flat fee
    }
}

// Subclass Burger
class Burger extends FoodItem implements Deliverable {
    private boolean isCheeseAdded;

    public Burger(String itemId, String name, double price, boolean isCheeseAdded) {
        super(itemId, name, price);
        this.isCheeseAdded = isCheeseAdded;
    }

    @Override
    public String getCategory() {
        return "Burger" + (isCheeseAdded ? " (Cheese)" : "");
    }

    @Override
    public int calculateDeliveryTime() {
        return 20;
    }

    @Override
    public double calculateDeliveryCharge() {
        return 30.0;
    }
}

// Subclass Beverage
class Beverage extends FoodItem implements Deliverable {
    private String type; // e.g., Cold/Hot

    public Beverage(String itemId, String name, double price, String type) {
        super(itemId, name, price);
        this.type = type;
    }

    @Override
    public String getCategory() {
        return "Beverage (" + type + ")";
    }

    @Override
    public int calculateDeliveryTime() {
        return 10;
    }

    @Override
    public double calculateDeliveryCharge() {
        return 20.0;
    }
}

// Main Class
public class FoodDeliveryDemo {
    public static void main(String[] args) {
        // Polymorphism: Array of FoodItems
        FoodItem[] orders = new FoodItem[] {
            new Pizza("P101", "Margherita", 299.0, "Medium"),
            new Burger("B202", "Veggie Burger", 149.0, true),
            new Beverage("D303", "Coca Cola", 49.0, "Cold")
        };

        for (FoodItem item : orders) {
            item.displayItemDetails();
            if (item instanceof Deliverable) {
                Deliverable d = (Deliverable) item;
                System.out.println("Delivery Time: " + d.calculateDeliveryTime() + " mins");
                System.out.println("Delivery Charge: ₹" + d.calculateDeliveryCharge());
            }
            System.out.println("-----------------------------------");
        }
    }
}