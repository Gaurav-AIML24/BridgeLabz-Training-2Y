import java.util.Scanner;

public class GeometryToolkit {

    public static double getDistance(int x1, int y1, int x2, int y2) {
        double dx = Math.pow(x2 - x1, 2);
        double dy = Math.pow(y2 - y1, 2);
        return Math.sqrt(dx + dy);
    }

    public static double[] getLineEquation(int x1, int y1, int x2, int y2) {
        double slope = (double)(y2 - y1) / (x2 - x1);
        double intercept = y1 - slope * x1;
        return new double[]{slope, intercept}; 
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter coordinates for two points:");

            System.out.print("Point 1 (x1 y1): ");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            System.out.print("Point 2 (x2 y2): ");
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            double distance = getDistance(x1, y1, x2, y2);
            double[] lineEquation = getLineEquation(x1, y1, x2, y2);

            System.out.printf("\nEuclidean Distance: %.2f units%n", distance);
            System.out.printf("Equation of Line: y = %.2fx + %.2f%n", lineEquation[0], lineEquation[1]);
        }
    }
}
