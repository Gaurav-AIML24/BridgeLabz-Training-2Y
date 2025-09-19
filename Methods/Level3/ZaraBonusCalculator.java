import java.util.Random;

public class ZaraBonusCalculator {

    public static int[][] generateEmployeeData(int count) {
        int[][] data = new int[count][2]; 
        Random rand = new Random();

        for (int i = 0; i < count; i++) {
            int salary = rand.nextInt(90000) + 10000; 
            int years = rand.nextInt(11); 
            data[i][0] = salary;
            data[i][1] = years;
        }

        return data;
    }

    public static double[][] calculateBonusAndNewSalary(int[][] data) {
        double[][] result = new double[data.length][2];

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            double newSalary = salary + bonus;

            result[i][0] = bonus;
            result[i][1] = newSalary;
        }

        return result;
    }

    public static void displaySummary(int[][] data, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "EmpID", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("-------------------------------------------------------------------------------");

        for (int i = 0; i < data.length; i++) {
            int salary = data[i][0];
            int years = data[i][1];
            double bonus = bonusData[i][0];
            double newSalary = bonusData[i][1];

            totalOldSalary += salary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15d %-15d %-15.2f %-15.2f%n", i + 1, salary, years, bonus, newSalary);
        }

        System.out.println("\n--- Totals ---");
        System.out.printf("Total Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus Paid: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);
    }

    public static void main(String[] args) {
        final int EMPLOYEES = 10;

        int[][] employeeData = generateEmployeeData(EMPLOYEES);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displaySummary(employeeData, bonusData);
    }
}
