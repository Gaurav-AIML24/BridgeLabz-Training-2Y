public class Student {
    // Static variables
    static String universityName = "XYZ University";
    static int totalStudents = 0;

    // Instance variables
    private String name;
    private final int rollNumber;
    private String grade;

    // Constructor using 'this'
    public Student(String name, int rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // Static method
    public static void displayTotalStudents() {
        System.out.println("Total students enrolled: " + totalStudents);
    }

    // Method with instanceof check for displaying grade
    public static void displayGrade(Object obj) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            System.out.println("Grade: " + s.grade);
        } else {
            System.out.println("Object is not a Student");
        }
    }

    // Method with instanceof check for updating grade
    public static void updateGrade(Object obj, String newGrade) {
        if (obj instanceof Student) {
            Student s = (Student) obj;
            s.grade = newGrade;
            System.out.println("Grade updated to: " + newGrade);
        } else {
            System.out.println("Object is not a Student");
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }
}
