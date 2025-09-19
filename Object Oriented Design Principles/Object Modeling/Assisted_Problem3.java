import java.util.ArrayList;

public class Assisted_Problem3 {

    static class Employee {
        private String name;

        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    static class Department {
        private String name;
        private ArrayList<Employee> employees;

        public Department(String name) {
            this.name = name;
            this.employees = new ArrayList<>();
        }

        public void addEmployee(Employee employee) {
            employees.add(employee);
        }

        public ArrayList<Employee> getEmployees() {
            return employees;
        }

        @Override
        public String toString() {
            return "Department{" +
                    "name='" + name + '\'' +
                    ", employees=" + employees +
                    '}';
        }
    }

    static class Company {
        private String name;
        private ArrayList<Department> departments;

        public Company(String name) {
            this.name = name;
            this.departments = new ArrayList<>();
        }

        public void addDepartment(Department department) {
            departments.add(department);
        }

        public ArrayList<Department> getDepartments() {
            return departments;
        }

        @Override
        public String toString() {
            return "Company{" +
                    "name='" + name + '\'' +
                    ", departments=" + departments +
                    '}';
        }
    }

    public static void main(String[] args) {
        // Create company
        Company company = new Company("TechCorp");

        // Create departments
        Department dept1 = new Department("Engineering");
        Department dept2 = new Department("HR");

        // Add employees to departments
        dept1.addEmployee(new Employee("John"));
        dept1.addEmployee(new Employee("Jane"));
        dept2.addEmployee(new Employee("Bob"));

        // Add departments to company (composition)
        company.addDepartment(dept1);
        company.addDepartment(dept2);

        // Show company structure
        System.out.println("Before deletion:");
        System.out.println(company);

        // Simulate deletion of company (composition: all parts are deleted)
        company = null;
        System.gc(); // Suggest garbage collection

        System.out.println("After deletion: Company and all its departments and employees are gone.");
    }
}
