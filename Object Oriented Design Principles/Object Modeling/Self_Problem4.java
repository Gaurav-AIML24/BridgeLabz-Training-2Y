import java.util.ArrayList;

public class Self_Problem4 {

    static class Product {
        private String name;
        private double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }
    }

    static class Order {
        private String orderId;
        private ArrayList<Product> products;

        public Order(String orderId) {
            this.orderId = orderId;
            this.products = new ArrayList<>();
        }

        public void addProduct(Product product) {
            products.add(product);
        }

        public void showOrder() {
            System.out.println("Order " + orderId + " contains:");
            for (Product p : products) {
                System.out.println(p);
            }
        }

        public String getOrderId() {
            return orderId;
        }
    }

    static class Customer {
        private String name;
        private ArrayList<Order> orders;

        public Customer(String name) {
            this.name = name;
            this.orders = new ArrayList<>();
        }

        public void placeOrder(Order order) {
            orders.add(order);
        }

        public void showOrders() {
            System.out.println("Orders for " + name + ":");
            for (Order o : orders) {
                o.showOrder();
            }
        }
    }

    public static void main(String[] args) {
        // Create products
        Product prod1 = new Product("Laptop", 1000);
        Product prod2 = new Product("Mouse", 20);
        Product prod3 = new Product("Keyboard", 50);

        // Create customer
        Customer customer = new Customer("John");

        // Create orders
        Order order1 = new Order("001");
        Order order2 = new Order("002");

        // Add products to orders (aggregation)
        order1.addProduct(prod1);
        order1.addProduct(prod2);
        order2.addProduct(prod3);

        // Customer places orders
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        // Show customer's orders
        customer.showOrders();
    }
}
