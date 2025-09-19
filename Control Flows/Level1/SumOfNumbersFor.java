import java.util.Scanner;
public class SumOfNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
        } else {
            int total = 0;
            for(int i=1;i<=n;i++) {
                total += i;
            }
            int result = n * (n + 1) / 2;
            if (total == result) {
                System.out.println("Sum using while loop = " + total);
                System.out.println("Sum using formula   = " + result);
                System.out.println("Results match.");
            } 
            else {
                System.out.println("Results do not match.");
            }
        }
        sc.close();
    }
}

