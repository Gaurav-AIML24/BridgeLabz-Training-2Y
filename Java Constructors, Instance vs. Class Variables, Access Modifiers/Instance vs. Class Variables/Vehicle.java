public class Vehicle {
    // Instance Variables
    private String ownerName;
    private String vehicleType;

    // Class Variable
    private static double registrationFee = 100.0;

    // Constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    // Instance Method
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

    // Class Method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}
