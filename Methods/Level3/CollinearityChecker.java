import java.util.Scanner;

public class CollinearityChecker {

    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double)(y2 - y1) / (x2 - x1);
        double slopeBC = (double)(y3 - y2) / (x3 - x2);
        double slopeAC = (double)(y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0.0;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter coordinates for three points:");

            System.out.print("Point A (x1 y1): ");
            int x1 = scanner.nextInt();
            int y1 = scanner.nextInt();

            System.out.print("Point B (x2 y2): ");
            int x2 = scanner.nextInt();
            int y2 = scanner.nextInt();

            System.out.print("Point C (x3 y3): ");
            int x3 = scanner.nextInt();
            int y3 = scanner.nextInt();

            boolean slopeCheck = areCollinearBySlope(x1, y1, x2, y2, x3, y3);
            boolean areaCheck = areCollinearByArea(x1, y1, x2, y2, x3, y3);

            System.out.println("\n--- Collinearity Check ---");
            System.out.println("Using Slope Method: " + (slopeCheck ? "Collinear ✅" : "Not Collinear ❌"));
            System.out.println("Using Area Method: " + (areaCheck ? "Collinear ✅" : "Not Collinear ❌"));
        }
    }
}
