import java.util.ArrayList;
import java.util.List;

// Interface for medical records
interface MedicalRecord {
    void addRecord(String record);
    void viewRecords();
}

// Abstract class Patient
abstract class Patient {
    private String patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation (Getters)
    public String getPatientId() { return patientId; }
    public String getName() { return name; }
    public int getAge() { return age; }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId +
                           ", Name: " + name +
                           ", Age: " + age);
    }
}

// Subclass InPatient
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double roomChargePerDay;
    private List<String> records = new ArrayList<>();

    public InPatient(String patientId, String name, int age,
                     int daysAdmitted, double roomChargePerDay) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.roomChargePerDay = roomChargePerDay;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * roomChargePerDay;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + records);
    }
}

// Subclass OutPatient
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private List<String> records = new ArrayList<>();

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        records.add(record);
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Records of " + getName() + ": " + records);
    }
}

// Main Class
public class HospitalDemo {
    public static void main(String[] args) {
        // Polymorphism: Patient array
        Patient[] patients = new Patient[] {
            new InPatient("P001", "Alice", 45, 5, 2000.0),
            new OutPatient("P002", "Bob", 30, 500.0)
        };

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill: ₹" + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord mr = (MedicalRecord) p;
                mr.addRecord("Checkup done");
                mr.addRecord("Medicine prescribed");
                mr.viewRecords();
            }
            System.out.println("-----------------------------------");
        }
    }
}