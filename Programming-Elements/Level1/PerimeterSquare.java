import java.util.Scanner;
public class PerimeterSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int perimeter;
        System.out.println("Enter perimeter: ");
        perimeter = input.nextInt();
        int side = perimeter/4;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
        input.close();
    }
}
