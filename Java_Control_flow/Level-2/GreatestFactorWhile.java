import java.util.Scanner;
class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), greatestFactor = 1, counter = n - 1;
        while (counter >= 1) {
            if (n % counter == 0) { greatestFactor = counter; break; }
            counter--;
        }
        System.out.println("Greatest factor = " + greatestFactor);
        sc.close();
    }
}
