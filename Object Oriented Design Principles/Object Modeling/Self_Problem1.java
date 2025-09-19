import java.util.ArrayList;

public class Self_Problem1 {

    static class Course {
        private String name;
        private ArrayList<Student> students;

        public Course(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        public void enrollStudent(Student student) {
            if (!students.contains(student)) {
                students.add(student);
                student.enrollInCourse(this);
            }
        }

        public void viewStudents() {
            System.out.println("Students in " + name + ":");
            for (Student student : students) {
                System.out.println(student.getName());
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
            for (Course course : courses) {
                System.out.println(course.getName());
            }
        }

        public String getName() {
            return name;
        }
    }

    static class School {
        private String name;
        private ArrayList<Student> students;

        public School(String name) {
            this.name = name;
            this.students = new ArrayList<>();
        }

        public void addStudent(Student student) {
            students.add(student);
        }

        public void showStudents() {
            System.out.println("Students in " + name + ":");
            for (Student student : students) {
                System.out.println(student.getName());
            }
        }
    }

    public static void main(String[] args) {
        // Create school
        School school = new School("High School");

        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Add students to school (aggregation)
        school.addStudent(student1);
        school.addStudent(student2);

        // Create courses
        Course course1 = new Course("Math");
        Course course2 = new Course("Science");

        // Enroll students in courses (association)
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Demonstrate
        school.showStudents();
        student1.viewCourses();
        course1.viewStudents();
    }
}
