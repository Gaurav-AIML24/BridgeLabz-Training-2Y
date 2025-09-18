import java.util.Scanner;
class GreatestFactorFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), greatestFactor = 1;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) { greatestFactor = i; break; }
        }
        System.out.println("Greatest factor = " + greatestFactor);
        sc.close();
    }
}
