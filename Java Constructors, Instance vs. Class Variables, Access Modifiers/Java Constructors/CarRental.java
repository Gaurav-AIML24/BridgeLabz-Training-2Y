public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double dailyRate = 50.0; // Assuming a fixed daily rate for simplicity

    // Default constructor
    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Unknown";
        this.rentalDays = 0;
    }

    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Calculate total cost
    public double calculateTotalCost() {
        return rentalDays * dailyRate;
    }
}
