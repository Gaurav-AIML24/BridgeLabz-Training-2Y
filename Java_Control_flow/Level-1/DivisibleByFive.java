import java.util.Scanner;
class DivisibleByFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0 ? "Yes" : "No"));
        sc.close();
    }
}
