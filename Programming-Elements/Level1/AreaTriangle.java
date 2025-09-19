import java.util.Scanner;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double height , base;
        System.out.println("Enter Height :");
        height = input.nextDouble();
        System.out.println("Enter Base :");
        base = input.nextDouble();
        double areainches = 0.5 * height * base;
        double areacm = areainches * 6.4516;
        System.out.println("Area of triangle in cm is "+areacm+" while in inches is "+areainches);
        input.close();
    }
}
