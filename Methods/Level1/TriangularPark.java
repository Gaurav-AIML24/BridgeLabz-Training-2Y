import java.util.Scanner;
public class TriangularPark {
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5km = 5000 meters
        return (int)Math.ceil(distance / perimeter);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();
        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();
        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();
        int rounds = calculateRounds(a, b, c);
        System.out.println("The athlete must complete " + rounds + " rounds.");
    }
}
