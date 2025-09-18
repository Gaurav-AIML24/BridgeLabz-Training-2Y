import java.util.Scanner;

public class EuclideanLine {

    // Method to calculate Euclidean distance
    public static double findDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    // Method to calculate slope and intercept (equation of line)
    public static double[] findLineEquation(double x1, double y1, double x2, double y2) {
        double m = (y2 - y1) / (x2 - x1);   // slope
        double b = y1 - m * x1;             // y-intercept
        return new double[]{m, b};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input 2 points
        System.out.print("Enter x1: ");
        double x1 = sc.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = sc.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = sc.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = sc.nextDouble();

        // Find distance
        double distance = findDistance(x1, y1, x2, y2);
        System.out.printf("Euclidean Distance = %.2f%n", distance);

        // Find line equation
        double[] line = findLineEquation(x1, y1, x2, y2);
        double slope = line[0];
        double intercept = line[1];

        System.out.printf("Equation of Line: y = %.2fx + %.2f%n", slope, intercept);

        sc.close();
    }
}