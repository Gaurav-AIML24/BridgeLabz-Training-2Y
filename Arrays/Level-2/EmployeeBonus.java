import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] salary = new double[10];
        double[] years = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];

        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter salary of employee " + (i + 1) + ": ");
            double s = sc.nextDouble();
            if (s <= 0) {
                System.out.println("Invalid salary! Enter again.");
                i--;
                continue;
            }
            salary[i] = s;

            System.out.println("Enter years of service of employee " + (i + 1) + ": ");
            double y = sc.nextDouble();
            if (y < 0) {
                System.out.println("Invalid years! Enter again.");
                i--;
                continue;
            }
            years[i] = y;
        }

        // Processing
        for (int i = 0; i < 10; i++) {
            if (years[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];

            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Output
        System.out.println("\n--- Employee Bonus Details ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Employee " + (i + 1) + ": Old Salary = " + salary[i] + 
                               ", Bonus = " + bonus[i] + ", New Salary = " + newSalary[i]);
        }

        System.out.println("\nTotal Bonus Paid by Zara = " + totalBonus);
        System.out.println("Total Old Salary = " + totalOldSalary);
        System.out.println("Total New Salary = " + totalNewSalary);

        sc.close();
    }
}