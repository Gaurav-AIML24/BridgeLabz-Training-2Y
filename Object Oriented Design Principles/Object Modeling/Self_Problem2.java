import java.util.ArrayList;

public class Self_Problem2 {

    static class Faculty {
        private String name;

        public Faculty(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Faculty{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class University {
        private String name;
        private ArrayList<Department> departments;
        private ArrayList<Faculty> faculties;

        public University(String name) {
            this.name = name;
            this.departments = new ArrayList<>();
            this.faculties = new ArrayList<>();
        }

        public void addDepartment(Department department) {
            departments.add(department);
        }

        public void addFaculty(Faculty faculty) {
            faculties.add(faculty);
        }

        public ArrayList<Department> getDepartments() {
            return departments;
        }

        public ArrayList<Faculty> getFaculties() {
            return faculties;
        }

        @Override
        public String toString() {
            return "University{" +
                    "name='" + name + '\'' +
                    ", departments=" + departments +
                    ", faculties=" + faculties +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Create university
        University university = new University("State University");

        // Create departments (composition)
        Department dept1 = new Department("Computer Science");
        Department dept2 = new Department("Mathematics");

        // Add departments to university
        university.addDepartment(dept1);
        university.addDepartment(dept2);

        // Create faculties (aggregation)
        Faculty faculty1 = new Faculty("Dr. Smith");
        Faculty faculty2 = new Faculty("Dr. Johnson");

        // Add faculties to university
        university.addFaculty(faculty1);
        university.addFaculty(faculty2);

        // Show university
        System.out.println("Before deletion:");
        System.out.println(university);

        // Simulate deletion of university (composition: departments are deleted, faculties exist independently)
        ArrayList<Faculty> independentFaculties = university.getFaculties(); // Keep reference to faculties
        university = null;
        System.gc();

        System.out.println("After deletion: University and departments are gone, but faculties exist:");
        for (Faculty f : independentFaculties) {
            System.out.println(f);
        }
    }
}
