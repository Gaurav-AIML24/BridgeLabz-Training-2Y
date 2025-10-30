package lambda_expression;
import java.util.Arrays;

class Product {
    String name;
    double price;
    int rating;
    Product(String n, double p, int r) {
        name = n;
        price = p;
        rating = r;
    }
}

public class ProductSort {
    public static void main(String[] args) {
        Product[] products = {
            new Product("A", 20, 4),
            new Product("B", 10, 5),
            new Product("C", 15, 3)
        };
        Arrays.sort(products, (p1, p2) -> Double.compare(p1.price, p2.price));
        for (Product p : products) {
            System.out.println(p.name + " " + p.price + " " + p.rating);
        }

    }
}
