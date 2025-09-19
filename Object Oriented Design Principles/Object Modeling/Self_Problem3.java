import java.util.ArrayList;

public class Self_Problem3 {

    static class Patient {
        private String name;
        private ArrayList<Doctor> doctors;

        public Patient(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
        }

        public void addDoctor(Doctor doctor) {
            if (!doctors.contains(doctor)) {
                doctors.add(doctor);
            }
        }

        public String getName() {
            return name;
        }
    }

    static class Doctor {
        private String name;
        private ArrayList<Patient> patients;

        public Doctor(String name) {
            this.name = name;
            this.patients = new ArrayList<>();
        }

        public void addPatient(Patient patient) {
            if (!patients.contains(patient)) {
                patients.add(patient);
                patient.addDoctor(this);
            }
        }

        public void consult(Patient patient) {
            System.out.println("Doctor " + name + " is consulting with patient " + patient.getName());
        }

        public String getName() {
            return name;
        }
    }

    static class Hospital {
        private String name;
        private ArrayList<Doctor> doctors;
        private ArrayList<Patient> patients;

        public Hospital(String name) {
            this.name = name;
            this.doctors = new ArrayList<>();
            this.patients = new ArrayList<>();
        }

        public void addDoctor(Doctor doctor) {
            doctors.add(doctor);
        }

        public void addPatient(Patient patient) {
            patients.add(patient);
        }
    }

    public static void main(String[] args) {
        // Create hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors and patients
        Doctor doctor1 = new Doctor("Dr. Lee");
        Doctor doctor2 = new Doctor("Dr. Kim");
        Patient patient1 = new Patient("Alice");
        Patient patient2 = new Patient("Bob");

        // Add to hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Associate doctors and patients
        doctor1.addPatient(patient1);
        doctor1.addPatient(patient2);
        doctor2.addPatient(patient1);

        // Demonstrate communication
        doctor1.consult(patient1);
        doctor2.consult(patient1);
        doctor1.consult(patient2);
    }
}
