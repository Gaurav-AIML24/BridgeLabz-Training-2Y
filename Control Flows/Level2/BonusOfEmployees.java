import java.util.Scanner;
public class BonusOfEmployees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter your years of service: ");
        int years = sc.nextInt();
        double bonus = 0.0;
        if (years > 5) {
            bonus = salary * 0.05;   
            System.out.println("Your bonus is: " + bonus);
        } else {
            System.out.println("No bonus. Work more than 5 years to get a bonus!");
        }
        sc.close();
    }
}
