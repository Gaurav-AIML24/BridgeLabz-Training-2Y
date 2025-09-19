import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Object Diagram: Customer Alice with products Apples and Milk
        Product apples = new Product("Apples", 2.0, 3.0); // 2 kg at $3 per kg
        Product milk = new Product("Milk", 1.0, 2.0); // 1 liter at $2 per liter
        Customer alice = new Customer("Alice", Arrays.asList(apples, milk));

        // Sequence: Customer checks out, BillGenerator generates total bill
        BillGenerator generator = new BillGenerator();
        System.out.println("Customer: " + alice.getName());
        System.out.println("Products:");
        for (Product p : alice.getProducts()) {
            System.out.println("  " + p.getName() + ": " + p.getQuantity() + " at $" + p.getPricePerUnit() + " per unit, total: $" + p.getTotal());
        }
        double totalBill = generator.calculateTotal(alice);
        System.out.println("Total Bill: $" + totalBill);
    }
}
