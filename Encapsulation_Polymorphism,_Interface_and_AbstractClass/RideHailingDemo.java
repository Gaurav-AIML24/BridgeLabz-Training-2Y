// Interface for GPS functionality
interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}

// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (Getters)
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }

    // Abstract Method
    public abstract double calculateFare(double distance);

    // Concrete Method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId +
                           ", Driver: " + driverName +
                           ", Rate per Km: ₹" + ratePerKm);
    }
}

// Subclass Car
class Car extends Vehicle implements GPS {
    private String currentLocation;

    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() * 0.8; // 20% cheaper
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Subclass Auto
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm() + 20; // ₹20 base fare
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}

// Main class
public class RideHailingDemo {
    public static void main(String[] args) {
        // Polymorphism: Array of Vehicle
        Vehicle[] rides = new Vehicle[] {
            new Car("C001", "Ravi", 15.0, "MG Road"),
            new Bike("B001", "Amit", 10.0, "Brigade Road"),
            new Auto("A001", "Sunil", 12.0, "Majestic")
        };

        double distance = 10.0; // 10 Km ride

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            double fare = v.calculateFare(distance);
            System.out.println("Fare for " + distance + " km: ₹" + fare);

            if (v instanceof GPS) {
                GPS gps = (GPS) v;
                System.out.println("Current Location: " + gps.getCurrentLocation());
                gps.updateLocation("Destination Reached");
                System.out.println("Updated Location: " + gps.getCurrentLocation());
            }
            System.out.println("--------------------------------");
        }
    }
}