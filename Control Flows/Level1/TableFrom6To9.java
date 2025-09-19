import java.util.Scanner;
public class TableFrom6To9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = sc.nextInt();
        for(int i =6; i<=9;i++) {
            int result = number*i;
            System.out.println(number+"*"+i+"="+result);
        }
        sc.close();
    }
}
