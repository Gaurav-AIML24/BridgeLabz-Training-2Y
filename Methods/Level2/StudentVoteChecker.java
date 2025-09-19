import java.util.Scanner;
public class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            boolean result = canStudentVote(ages[i]);
            System.out.println("Student " + (i + 1) + " Age " + ages[i] + " => " +
                    (result ? "Can Vote" : "Cannot Vote"));
        }
    }
}

