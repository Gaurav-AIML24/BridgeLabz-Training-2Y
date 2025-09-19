public class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;

    private final int id;
    private String name;
    private String designation;

    public Employee(String name, int id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }

    public static void displayTotalEmployees() {
        System.out.println("Total employees: " + totalEmployees);
    }

    public void displayDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 101, "Developer");
        if (emp instanceof Employee) {
            emp.displayDetails();
        } else {
            System.out.println("Object is not an instance of Employee");
        }
        Employee.displayTotalEmployees();
    }
}
