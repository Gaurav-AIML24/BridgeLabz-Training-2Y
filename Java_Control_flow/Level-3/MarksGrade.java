import java.util.Scanner;

class MarksGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Physics marks: ");
        int phy = input.nextInt();
        System.out.print("Enter Chemistry marks: ");
        int chem = input.nextInt();
        System.out.print("Enter Maths marks: ");
        int math = input.nextInt();

        double average = (phy + chem + math) / 3.0;

        System.out.println("Average = " + average);

        if (average >= 90) {
            System.out.println("Grade: A (Excellent)");
        } else if (average >= 75) {
            System.out.println("Grade: B (Very Good)");
        } else if (average >= 60) {
            System.out.println("Grade: C (Good)");
        } else if (average >= 40) {
            System.out.println("Grade: D (Pass)");
        } else {
            System.out.println("Grade: F (Fail)");
        }

        input.close();
    }
}
