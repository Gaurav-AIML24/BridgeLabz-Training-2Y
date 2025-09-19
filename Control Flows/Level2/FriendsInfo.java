import java.util.Scanner;
public class FriendsInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();
        System.out.print("Enter Amar's height: ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height: ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height: ");
        double heightAnthony = sc.nextDouble();
        if (ageAmar < ageAkbar && ageAmar < ageAnthony) {
            System.out.println("Youngest friend is Amar (Age: " + ageAmar + ")");
        } else if (ageAkbar < ageAmar && ageAkbar < ageAnthony) {
            System.out.println("Youngest friend is Akbar (Age: " + ageAkbar + ")");
        } else if (ageAnthony < ageAmar && ageAnthony < ageAkbar) {
            System.out.println("Youngest friend is Anthony (Age: " + ageAnthony + ")");
        } else {
            System.out.println("Two or more friends have the same youngest age.");
        }
        if (heightAmar > heightAkbar && heightAmar > heightAnthony) {
            System.out.println("Tallest friend is Amar (Height: " + heightAmar + ")");
        } else if (heightAkbar > heightAmar && heightAkbar > heightAnthony) {
            System.out.println("Tallest friend is Akbar (Height: " + heightAkbar + ")");
        } else if (heightAnthony > heightAmar && heightAnthony > heightAkbar) {
            System.out.println("Tallest friend is Anthony (Height: " + heightAnthony + ")");
        } else {
            System.out.println("Two or more friends have the same tallest height.");
        }
        sc.close();
    }
}

