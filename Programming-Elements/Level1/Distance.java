import java.util.Scanner;
public class Distance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancefeet;
        System.out.println("Enter distance in feet: ");
        distancefeet = input.nextDouble();
        double distanceyards = distancefeet*3;
        double distancemiles = distanceyards*1760;
        System.out.println("Distance in feet is "+distancefeet+" whereas in yards is "+distanceyards+" and miles is "+distancemiles);
        input.close();
    }   
}
