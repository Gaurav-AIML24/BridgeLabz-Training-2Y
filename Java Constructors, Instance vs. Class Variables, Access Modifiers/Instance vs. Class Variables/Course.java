public class Course {
    // Instance Variables
    private String courseName;
    private int duration;
    private double fee;

    // Class Variable
    private static String instituteName = "Default Institute";

    // Constructor
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance Method
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
        System.out.println("Fee: " + fee);
        System.out.println("Institute Name: " + instituteName);
    }

    // Class Method
    public static void updateInstituteName(String newName) {
        instituteName = newName;
    }
}
