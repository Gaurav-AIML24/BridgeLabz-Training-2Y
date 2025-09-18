import java.util.Scanner;

public class QuadraticRoots {

    public static void findRoots(double a, double b, double c) {
        if (a == 0) {
            System.out.println("Not a quadratic equation.");
            return;
        }

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are real and distinct: " + root1 + " , " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and equal: " + root);
        } else {
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("Roots are imaginary: " + real + " + " + imaginary + "i and " + real + " - " + imaginary + "i");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = sc.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = sc.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = sc.nextDouble();

        findRoots(a, b, c);

        sc.close();
    }
}