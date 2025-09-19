// Base class Course
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }
}

// Subclass OnlineCourse extends Course
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
}

// Subclass PaidOnlineCourse extends OnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount;

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: ₹" + (fee - (fee * discount / 100)));
    }
}

// Main class to test
public class SampleProblem2 {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
            "Java Programming",
            8,
            "Udemy",
            true,
            4999,
            20
        );

        poc.displayCourseInfo();
    }
}