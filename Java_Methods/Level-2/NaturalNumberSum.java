import java.util.Scanner;

public class NaturalNumberSum {

    // Recursive method
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (>0).");
        } else {
            int sumRec = sumRecursive(n);
            int sumFor = sumFormula(n);

            System.out.println("Sum using recursion: " + sumRec);
            System.out.println("Sum using formula: " + sumFor);

            if (sumRec == sumFor) {
                System.out.println("Both results are correct ✅");
            } else {
                System.out.println("Mismatch ❌");
            }
        }

        sc.close();
    }
}