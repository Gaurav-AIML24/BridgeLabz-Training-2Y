import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] phy = new int[n], chem = new int[n], math = new int[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter Physics marks for student " + (i+1) + ": ");
            phy[i] = sc.nextInt();
            System.out.print("Enter Chemistry marks for student " + (i+1) + ": ");
            chem[i] = sc.nextInt();
            System.out.print("Enter Maths marks for student " + (i+1) + ": ");
            math[i] = sc.nextInt();

            percentage[i] = (phy[i] + chem[i] + math[i]) / 3.0;

            if (percentage[i] >= 85) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 50) grade[i] = 'C';
            else grade[i] = 'F';
        }

        System.out.println("\nPhysics | Chemistry | Maths | % | Grade");
        for (int i = 0; i < n; i++) {
            System.out.println(phy[i] + " | " + chem[i] + " | " + math[i] + " | " + percentage[i] + " | " + grade[i]);
        }

        sc.close();
    }
}