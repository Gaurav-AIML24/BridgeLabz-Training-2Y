class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed.");
        } else {
            System.out.println("Not enough items to remove.");
        }
    }

    void displayTotalCost() {
        System.out.println("Total cost of " + itemName + ": " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Shoes", 2000, 2);
        cart.addItem(1);
        cart.removeItem(1);
        cart.displayTotalCost();
    }
}
