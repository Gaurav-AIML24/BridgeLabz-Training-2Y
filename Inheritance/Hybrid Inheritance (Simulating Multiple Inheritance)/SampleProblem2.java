// Superclass Vehicle
class Vehicle {
    String model;
    int maxSpeed;

    Vehicle(String model, int maxSpeed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
    }
}

// Refuelable interface
interface Refuelable {
    void refuel();
}

// Subclass ElectricVehicle extends Vehicle
class ElectricVehicle extends Vehicle {

    ElectricVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    void charge() {
        System.out.println(model + " (Electric) is charging.");
    }
}

// Subclass PetrolVehicle extends Vehicle & implements Refuelable
class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(String model, int maxSpeed) {
        super(model, maxSpeed);
    }

    @Override
    public void refuel() {
        System.out.println(model + " (Petrol) is refueling at the station.");
    }
}

// Main class to test
public class SampleProblem2 {
    public static void main(String[] args) {
        ElectricVehicle ev = new ElectricVehicle("Tesla Model 3", 220);
        PetrolVehicle pv = new PetrolVehicle("Honda Civic", 180);

        ev.charge();
        pv.refuel();
    }
}