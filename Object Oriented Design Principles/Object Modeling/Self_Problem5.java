import java.util.ArrayList;

public class Self_Problem5 {

    static class Professor {
        private String name;
        private ArrayList<Course> courses;

        public Professor(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }

        public void assignToCourse(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
                course.assignProfessor(this);
            }
        }

        public String getName() {
            return name;
        }
    }

    static class Course {
        private String name;
        private Professor professor;
        private ArrayList<Student> students;

        public Course(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        public void assignProfessor(Professor professor) {
            this.professor = professor;
        }

        public void enrollStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
                student.enrollInCourse(this);
            }
        }

        public void showDetails() {
            System.out.println("Course: " + name);
            if (professor != null) {
                System.out.println("Taught by: " + professor.getName());
            }
            System.out.println("Enrolled students:");
            for (Student s : students) {
                System.out.println(s.getName());
            }
        }

        public String getName() {
            return name;
        }
    }

    static class Student {
        private String name;
        private ArrayList<Course> courses;

        public Student(String name) {
            this.name = name;
            this.courses = new ArrayList<>();
        }

        public void enrollInCourse(Course course) {
            if (!courses.contains(course)) {
                courses.add(course);
            }
        }

        public void viewCourses() {
            System.out.println("Courses for " + name + ":");
            for (Course c : courses) {
                System.out.println(c.getName());
            }
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        // Create professors
        Professor prof1 = new Professor("Dr. Smith");
        Professor prof2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("CS101");
        Course course2 = new Course("Math101");

        // Assign professors to courses
        prof1.assignToCourse(course1);
        prof2.assignToCourse(course2);

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Show details
        course1.showDetails();
        course2.showDetails();
        student1.viewCourses();
    }
}
