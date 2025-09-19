import java.util.Scanner;

public class BMICalculator {

    public static String[] calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);

        String status;
        if (bmi < 18.5) status = "Underweight";
        else if (bmi < 24.9) status = "Normal";
        else if (bmi < 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] processBMI(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            String[] bmiData = calculateBMI(data[i][0], data[i][1]);
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);
            result[i][2] = bmiData[0];
            result[i][3] = bmiData[1];
        }
        return result;
    }

    public static void displayTable(String[][] table) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Height(cm)", "Weight(kg)", "BMI", "Status");
        for (String[] row : table) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] members = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.print("Height (cm) for member " + (i + 1) + ": ");
            members[i][1] = sc.nextDouble();
            System.out.print("Weight (kg) for member " + (i + 1) + ": ");
            members[i][0] = sc.nextDouble();
        }

        String[][] results = processBMI(members);
        displayTable(results);
    }
}

