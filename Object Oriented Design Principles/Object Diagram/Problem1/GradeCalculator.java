import java.util.List;

public class GradeCalculator {
    public double calculateAverage(Student student) {
        List<Subject> subjects = student.getSubjects();
        if (subjects.isEmpty()) return 0.0;
        int total = 0;
        for (Subject s : subjects) {
            total += s.getMarks();
        }
        return (double) total / subjects.size();
    }

    public String calculateGrade(Student student) {
        double avg = calculateAverage(student);
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
    }
}
