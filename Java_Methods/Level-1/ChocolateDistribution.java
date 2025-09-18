import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{remaining, each};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets: " + result[1] + " chocolates");
        System.out.println("Remaining chocolates: " + result[0]);
        sc.close();
    }
}