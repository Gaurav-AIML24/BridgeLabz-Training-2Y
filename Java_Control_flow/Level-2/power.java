import java.util.Scanner;
class power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), power = sc.nextInt(), result = 1;
        if (num > 0 && power >= 0) {
            for (int i = 1; i <= power; i++) result *= num;
            System.out.println("Result = " + result);
        } else System.out.println("Invalid input");
        sc.close();
    }
}
