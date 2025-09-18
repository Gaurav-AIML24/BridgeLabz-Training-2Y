import java.util.Scanner;
class Vote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18) System.out.println("person's age" + age + " and can vote.");
        else System.out.println("The person's age is " + age + " and cannot vote.");
        sc.close();
    }
}
