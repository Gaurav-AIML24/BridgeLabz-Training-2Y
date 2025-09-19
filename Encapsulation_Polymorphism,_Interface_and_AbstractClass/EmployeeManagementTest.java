import java.util.*;

// Interface Department
interface Department {
    void assignDepartment(String dept);
    String getDepartmentDetails();
}

// Abstract class Employee
abstract class Employee {
    private int employeeId;
    private String name;
    private double baseSalary;

    // Constructor
    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation: Getters & Setters
    public int getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Base Salary: ₹" + baseSalary);
    }
}

// Subclass: FullTimeEmployee
class FullTimeEmployee extends Employee implements Department {
    private String department;

    public FullTimeEmployee(int employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        // Full-time fixed salary
        return getBaseSalary();
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Subclass: PartTimeEmployee
class PartTimeEmployee extends Employee implements Department {
    private String department;
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(int employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, 0); // base salary not fixed for part-time
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void assignDepartment(String dept) {
        this.department = dept;
    }

    @Override
    public String getDepartmentDetails() {
        return "Department: " + department;
    }
}

// Main class
public class EmployeeManagementTest {
    public static void main(String[] args) {
        // Polymorphism: Store all employees in a list
        List<Employee> employees = new ArrayList<>();

        FullTimeEmployee e1 = new FullTimeEmployee(101, "Amit", 40000);
        e1.assignDepartment("IT");

        PartTimeEmployee e2 = new PartTimeEmployee(102, "Priya", 500, 60);
        e2.assignDepartment("HR");

        employees.add(e1);
        employees.add(e2);

        // Process using Employee reference
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: ₹" + emp.calculateSalary());

            // Typecasting to access Department info
            if (emp instanceof Department) {
                Department dept = (Department) emp;
                System.out.println(dept.getDepartmentDetails());
            }

            System.out.println("-----------------------------------");
        }
    }
}