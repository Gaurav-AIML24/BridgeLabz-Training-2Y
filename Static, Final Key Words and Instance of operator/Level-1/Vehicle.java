public class Vehicle {
    // Static variables
    static double registrationFee = 500.0;

    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;

    // Constructor using 'this'
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // Static method
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    // Method with instanceof check for displaying registration details
    public static void displayRegistrationDetails(Object obj) {
        if (obj instanceof Vehicle) {
            Vehicle v = (Vehicle) obj;
            System.out.println("Owner: " + v.ownerName + ", Type: " + v.vehicleType + ", Registration Number: " + v.registrationNumber + ", Fee: " + registrationFee);
        } else {
            System.out.println("Object is not a Vehicle");
        }
    }

    // Getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }
}
