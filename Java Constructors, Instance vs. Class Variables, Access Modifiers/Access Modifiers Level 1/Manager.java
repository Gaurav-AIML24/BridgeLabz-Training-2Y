public class Manager extends Employee {

    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary);
    }

    public void display() {
        // Accessing public member
        System.out.println("Employee ID: " + employeeID);
        // Accessing protected member
        System.out.println("Department: " + department);
        // Cannot access private member salary directly here
        System.out.println("Salary (accessed via getter): " + getSalary());
    }

    public static void main(String[] args) {
        Manager mgr = new Manager(201, "HR", 50000.0);
        mgr.display();
    }
}
