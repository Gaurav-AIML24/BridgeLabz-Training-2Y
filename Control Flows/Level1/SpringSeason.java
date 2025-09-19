import java.util.Scanner;
public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month: ");
        int month = sc.nextInt();
        System.out.println("Enter Day: ");
        int day = sc.nextInt();
        boolean isSpring = (month == 3 && day >= 20 && day <= 31)||(month == 4 && day >= 1 && day <= 30)||(month == 5 && day >= 1 && day <= 31)||(month == 6 && day >= 1 && day <= 20); 
        if(isSpring) {
            System.out.println("It's Spring season.");
        }
        else {
            System.out.println("It's not Spring season.");
        }
    }
}
