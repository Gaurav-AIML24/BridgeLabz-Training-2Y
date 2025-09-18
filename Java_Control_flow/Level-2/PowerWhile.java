import java.util.Scanner;
class PowerWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(), power = sc.nextInt(), result = 1, counter = 0;
        if (num > 0 && power >= 0) {
            while (counter < power) {
                result *= num;
                counter++;
            }
            System.out.println("Result = " + result);
        } else System.out.println("Invalid input");
        sc.close();
    }
}
