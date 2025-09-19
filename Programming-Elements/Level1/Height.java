import java.util.Scanner;
public class Height {
    public static void main(String[] args) {
        double height;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter yout height:");
        height = input.nextInt();
        double inches = height/2.54;
        int feet = (int)(inches/12);
        int leftinches = (int)(inches%12);
        System.out.println("Your Height in cm is "+height+" while in feet is "+feet+" and inches is "+leftinches);

        input.close();
    }
}
