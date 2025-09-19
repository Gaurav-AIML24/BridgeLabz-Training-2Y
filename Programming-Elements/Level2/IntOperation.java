import java.util.Scanner;
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter value of a, b and c");
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        int operation1 = a + b *c;
        int operation2 = a * b + c;
        int operation3 = c + a / b;
        int operation4 = a % b + c;
        System.out.println("Output of operation1, operation2, operation3, operation4 are "+operation1+" , "+operation2+" , "+operation3+" , "+operation4);
        input.close();
    }
}
