public class Patient {
    // Static variables
    static String hospitalName = "ABC Hospital";
    static int totalPatients = 0;

    // Instance variables
    private String name;
    private int age;
    private String ailment;
    private final int patientID;

    // Constructor using 'this'
    public Patient(String name, int age, String ailment, int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }

    // Static method
    public static int getTotalPatients() {
        return totalPatients;
    }

    // Method with instanceof check for displaying patient details
    public static void displayPatientDetails(Object obj) {
        if (obj instanceof Patient) {
            Patient p = (Patient) obj;
            System.out.println("Name: " + p.name + ", Age: " + p.age + ", Ailment: " + p.ailment + ", Patient ID: " + p.patientID);
        } else {
            System.out.println("Object is not a Patient");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAilment() {
        return ailment;
    }

    public int getPatientID() {
        return patientID;
    }
}
