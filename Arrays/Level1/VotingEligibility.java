import java.util.Scanner;
public class VotingEligibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        System.out.println("Enter the age of 10 students:");
        for (int i = 0; i < ages.length; i++) {
            ages[i] = sc.nextInt();
        }
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age: " + age);
            } else if (age >= 18) {
                System.out.println("The student with the age " + age + " can vote.");
            } else {
                System.out.println("The student with the age " + age + " cannot vote.");
            }
        }
        sc.close();
    }
}
