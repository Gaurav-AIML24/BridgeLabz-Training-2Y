// Interface for Insurable Vehicles
interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

// Abstract Class Vehicle
abstract class Vehicle {
    private String vehicleNumber;
    private String type;
    private double rentalRate;

    // Constructor
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation (Getters & Setters)
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }

    // Abstract Method
    public abstract double calculateRentalCost(int days);

    // Concrete Method
    public void displayDetails() {
        System.out.println("Vehicle No: " + vehicleNumber + ", Type: " + type + ", Rate: " + rentalRate + " per day");
    }
}

// Car Class
class Car extends Vehicle implements Insurable {
    public Car(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Car", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days; // No extra charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.10; // 10% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 10% of rental rate";
    }
}

// Bike Class
class Bike extends Vehicle implements Insurable {
    public Bike(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Bike", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // 20% discount
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.05; // 5% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: 5% of rental rate";
    }
}

// Truck Class
class Truck extends Vehicle implements Insurable {
    public Truck(String vehicleNumber, double rentalRate) {
        super(vehicleNumber, "Truck", rentalRate);
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // Extra fixed charge
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 15% of rental rate";
    }
}

// Main Class
public class VehicleRentalDemo {
    public static void main(String[] args) {
        // Polymorphism - Array of Vehicles
        Vehicle[] vehicles = new Vehicle[] {
            new Car("C101", 2000),
            new Bike("B202", 500),
            new Truck("T303", 5000)
        };

        int days = 5; // Suppose rental for 5 days

        for (Vehicle v : vehicles) {
            v.displayDetails();
            double rentalCost = v.calculateRentalCost(days);

            double insurance = 0;
            if (v instanceof Insurable) {
                insurance = ((Insurable) v).calculateInsurance();
                System.out.println(((Insurable) v).getInsuranceDetails());
            }

            double totalCost = rentalCost + insurance;
            System.out.println("Rental Cost for " + days + " days: " + rentalCost);
            System.out.println("Insurance: " + insurance);
            System.out.println("Total Cost: " + totalCost);
            System.out.println("----------------------------------");
        }
    }
}