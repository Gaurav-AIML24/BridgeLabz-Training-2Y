import java.util.Scanner;
class SumNaturalFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n > 0) {
            int sum = 0;
            for (int i = 1; i <= n; i++) sum += i;
            int formula = n * (n + 1) / 2;
            System.out.println("For sum = " + sum + ", Formula sum = " + formula);
        } else System.out.println("Not a natural number");
        sc.close();
    }
}
