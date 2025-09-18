import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[][] marks = new int[n][3]; // phy, chem, math
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics, Chemistry, Maths marks for student " + (i+1) + ": ");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextInt();
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 85) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\nPhysics | Chemistry | Maths | % | Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(marks[i][0] + " | " + marks[i][1] + " | " + marks[i][2] + " | " + percentage[i] + " | " + grade[i]);
        }

        sc.close();
    }
}