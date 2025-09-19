import java.util.Scanner;
public class VotingEligibility {
    public static boolean isEligible(int age) {
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        if (isEligible(age)) {
            System.out.println("You are eligible to vote ✅");
        } else {
            System.out.println("You are NOT eligible to vote ❌");
        }
    }
}

