import java.util.Random;

public class ZaraBonus {

    // Method to generate old salary and years of service
    public static int[][] generateEmployeeData(int n) {
        Random rand = new Random();
        int[][] data = new int[n][2]; // [salary, years of service]

        for (int i = 0; i < n; i++) {
            int salary = 10000 + rand.nextInt(90000); // 5-digit salary
            int years = 1 + rand.nextInt(10);         // 1 to 10 years
            data[i][0] = salary;
            data[i][1] = years;
        }
        return data;
    }

    // Method to calculate bonus and new salary
    public static double[][] calculateBonus(int[][] employeeData) {
        int n = employeeData.length;
        double[][] result = new double[n][2]; // [bonus, newSalary]

        for (int i = 0; i < n; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }
        return result;
    }

    // Method to display table and totals
    public static void displayTable(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0, totalNewSalary = 0, totalBonus = 0;

        System.out.printf("%-10s %-12s %-12s %-12s %-12s%n",
                "EmpID", "OldSalary", "Years", "Bonus", "NewSalary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int salary = employeeData[i][0];
            int years = employeeData[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-12d %-12d %-12.2f %-12.2f%n",
                    (i + 1), salary, years, bonus, newSalary);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("%-10s %-12.2f %-12s %-12.2f %-12.2f%n",
                "TOTAL", totalOldSalary, "", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonus(employeeData);
        displayTable(employeeData, bonusData);
    }
}