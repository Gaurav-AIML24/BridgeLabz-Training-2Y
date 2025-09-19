// Superclass Device
class Device {
    String deviceId;
    String status;

    Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }
}

// Subclass Thermostat (inherits from Device)
class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(String deviceId, String status, int temperatureSetting) {
        super(deviceId, status); // call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    // Method to display device status
    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}

// Main class to test
public class SampleProblem2 {
    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat(
            "T1001",
            "ON",
            24
        );

        thermostat.displayStatus();
    }
}