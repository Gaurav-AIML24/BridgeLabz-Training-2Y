import java.util.Scanner;
public class CounterForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Counter: ");
        int counter = sc.nextInt();
        for(int i = counter; i>=1; i--) {
            System.out.println(i);
        }
        sc.close();
    }
}
