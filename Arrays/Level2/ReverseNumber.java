import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String numStr = String.valueOf(number);
        int len = numStr.length();
        int[] digits = new int[len];
        for (int i = 0; i < len; i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        System.out.println("Reversed Number:");
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(digits[i]);
        }
        sc.close();
    }
}
