import java.util.Scanner;
public class GreatestFactorWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();
        int greatestFactor = 1;
        int counter = number - 1;
        if (number > 1) {
            while (counter >= 1) {
                if (number % counter == 0) {
                    greatestFactor = counter;
                    break; 
                }
                counter--;
            }
            System.out.println("Greatest factor of " + number + " (excluding itself) is: " + greatestFactor);
        } else {
            System.out.println("Please enter an integer greater than 1!");
        }
        sc.close();
    }
}
