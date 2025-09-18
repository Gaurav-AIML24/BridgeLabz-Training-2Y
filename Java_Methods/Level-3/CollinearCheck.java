import java.util.Scanner;

public class CollinearCheck {

    // Method to check collinearity using slope formula
    public static boolean checkCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Handle division by zero by cross multiplication
        int slope1 = (y2 - y1) * (x3 - x2);
        int slope2 = (y3 - y2) * (x2 - x1);
        int slope3 = (y3 - y1) * (x2 - x1);

        // Check slopes equality without division
        return slope1 == slope2 && slope1 == slope3;
    }

    // Method to check collinearity using area of triangle formula
    public static boolean checkCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input points
        System.out.print("Enter x1 y1: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
        System.out.print("Enter x2 y2: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt();
        System.out.print("Enter x3 y3: ");
        int x3 = sc.nextInt(), y3 = sc.nextInt();

        // Check collinearity using slope method
        if (checkCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear (Slope Method)");
        } else {
            System.out.println("Points are NOT Collinear (Slope Method)");
        }

        // Check collinearity using area method
        if (checkCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("Points are Collinear (Area Method)");
        } else {
            System.out.println("Points are NOT Collinear (Area Method)");
        }

        sc.close();
    }
}