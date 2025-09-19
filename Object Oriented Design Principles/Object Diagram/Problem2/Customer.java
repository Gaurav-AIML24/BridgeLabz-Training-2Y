import java.util.List;

public class Customer {
    private String name;
    private List<Product> products;

    public Customer(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }
}
