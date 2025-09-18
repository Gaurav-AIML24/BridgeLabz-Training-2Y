import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0; // convert cm to m
        return weight / (heightM * heightM);
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 24.9) return "Normal";
        else if (bmi < 29.9) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[][] personData = new double[10][3]; // weight, height, bmi
        String[] bmiStatus = new String[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();

            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
            bmiStatus[i] = getBMIStatus(personData[i][2]);
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " - Weight: " + personData[i][0] 
                               + " kg, Height: " + personData[i][1] 
                               + " cm, BMI: " + personData[i][2] 
                               + ", Status: " + bmiStatus[i]);
        }

        sc.close();
    }
}