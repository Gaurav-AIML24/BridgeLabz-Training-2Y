import java.util.Scanner;
class MultiplesWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num > 0 && num < 100) {
            int counter = 100;
            while (counter >= 1) {
                if (counter % num == 0) System.out.println(counter);
                counter--;
            }
        } else System.out.println("Invalid number");
        sc.close();
    }
}
