import java.util.Scanner;
public class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radian = Math.toRadians(angle);
        double sine = Math.sin(radian);
        double cosine = Math.cos(radian);
        double tangent = Math.tan(radian);
        return new double[]{sine, cosine, tangent};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();
        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + result[0] +
                ", Cosine = " + result[1] +
                ", Tangent = " + result[2]);
    }
}

