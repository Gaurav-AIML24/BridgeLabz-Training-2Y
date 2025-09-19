public class Product {
    private String name;
    private double quantity;
    private double pricePerUnit;

    public Product(String name, double quantity, double pricePerUnit) {
        this.name = name;
        this.quantity = quantity;
        this.pricePerUnit = pricePerUnit;
    }

    public String getName() {
        return name;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPricePerUnit() {
        return pricePerUnit;
    }

    public double getTotal() {
        return quantity * pricePerUnit;
    }
}
