import java.util.List;

public class BillGenerator {
    public double calculateTotal(Customer customer) {
        List<Product> products = customer.getProducts();
        double total = 0.0;
        for (Product p : products) {
            total += p.getTotal();
        }
        return total;
    }
}
