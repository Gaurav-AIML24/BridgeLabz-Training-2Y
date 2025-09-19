import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Base: ");
        int base = sc.nextInt();
        System.out.print("Enter Exponent: ");
        int exp = sc.nextInt();

        double result = Math.pow(base, exp);
        System.out.println(base + "^" + exp + " = " + result);
        sc.close();
    }
}
