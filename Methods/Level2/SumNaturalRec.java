import java.util.Scanner;
public class SumNaturalRec {
    public static int sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }
    public static int sumFormula(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Not a natural number.");
            return;
        }
        int recSum = sumRecursive(n);
        int formulaSum = sumFormula(n);
        System.out.println("Sum using recursion = " + recSum);
        System.out.println("Sum using formula = " + formulaSum);
        if (recSum == formulaSum) System.out.println("Both results are same ✔");
        else System.out.println("Mismatch ❌");
    }
}

