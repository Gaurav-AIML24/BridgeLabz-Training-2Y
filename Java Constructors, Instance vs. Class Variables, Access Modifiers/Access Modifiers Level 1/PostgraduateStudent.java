public class PostgraduateStudent extends Student {

    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA);
    }

    public void display() {
        // Accessing public member
        System.out.println("Roll Number: " + rollNumber);
        // Accessing protected member
        System.out.println("Name: " + name);
        // Cannot access private member CGPA directly here
        System.out.println("CGPA (accessed via getter): " + getCGPA());
    }

    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Alice", 9.1);
        pgStudent.display();
    }
}
