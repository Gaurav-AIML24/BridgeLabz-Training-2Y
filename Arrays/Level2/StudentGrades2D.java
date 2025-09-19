import java.util.Scanner;
public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        double[][] marks = new double[n][3]; // [phy, chem, maths]
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks (Phy, Chem, Math) for student " + (i+1) + ":");
            for (int j = 0; j < 3; j++) {
                marks[i][j] = sc.nextDouble();
            }
            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
            if (percentage[i] >= 90) grade[i] = 'A';
            else if (percentage[i] >= 75) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }
        System.out.println("\n--- Results ---");
        for (int i = 0; i < n; i++) {
            System.out.println("Student " + (i+1) + ": Phy=" + marks[i][0] +" Chem=" + marks[i][1] +" Math=" + marks[i][2] +" %=" + percentage[i] +" Grade=" + grade[i]);
        }
        sc.close();
    }
}

