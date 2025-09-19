import java.util.Scanner;
public class Counter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Counter: ");
        int counter = sc.nextInt();
        while(counter>=1) {
            System.out.println(counter);
            counter--;
        }
        sc.close();
    }
}
