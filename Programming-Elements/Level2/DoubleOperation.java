import java.util.Scanner;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter value of a, b and c");
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();
        double operation1 = a + b *c;
        double operation2 = a * b + c;
        double operation3 = c + a / b;
        double operation4 = a % b + c;
        System.out.println("Output of operation1, operation2, operation3, operation4 are "+operation1+" , "+operation2+" , "+operation3+" , "+operation4);
        input.close();
    }
}
