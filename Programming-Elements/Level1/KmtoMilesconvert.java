import java.util.Scanner;
public class KmtoMilesconvert {
    public static void main(String[] args) {
        double km;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of km");
        km = input.nextDouble();
        double result = km * 0.621371;
        System.out.println("The total miles is "+result+" mile for the given "+km+" km");
        input.close();
    }
}
