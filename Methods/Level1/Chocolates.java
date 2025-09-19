import java.util.Scanner;
public class Chocolates {
    public static int[] divideChocolates(int chocolates, int children) {
        int each = chocolates / children;
        int remaining = chocolates % children;
        return new int[]{each, remaining};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of Children: ");
        int children = sc.nextInt();
        int[] result = divideChocolates(chocolates, children);
        System.out.println("Each child gets " + result[0] +
                " chocolates, Remaining = " + result[1]);
    }
}
