import java.util.Scanner;

public class PerimeterRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        double perimeter = 2 * (l + w);
        System.out.println("Perimeter = " + perimeter);
        sc.close();
    }
}
