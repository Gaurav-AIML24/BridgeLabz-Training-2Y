import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Object Diagram: Student John with subjects Maths and Science
        Subject maths = new Subject("Maths", 90);
        Subject science = new Subject("Science", 85);
        Student john = new Student("John", Arrays.asList(maths, science));

        // Sequence: Student requests grade, GradeCalculator computes
        GradeCalculator calc = new GradeCalculator();
        System.out.println("Student: " + john.getName());
        System.out.println("Subjects:");
        for (Subject s : john.getSubjects()) {
            System.out.println("  " + s.getName() + ": " + s.getMarks());
        }
        double average = calc.calculateAverage(john);
        String grade = calc.calculateGrade(john);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}
