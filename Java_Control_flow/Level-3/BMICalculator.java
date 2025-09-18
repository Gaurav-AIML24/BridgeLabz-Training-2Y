import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight (kg): ");
        double weight = input.nextDouble();
        System.out.print("Enter height (cm): ");
        double heightCm = input.nextDouble();

        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);

        System.out.println("BMI = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal weight");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }

        input.close();
    }
}
