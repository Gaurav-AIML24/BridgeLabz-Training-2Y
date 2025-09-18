import java.util.Scanner;
public class larger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        System.out.println((a>=b && a>=c));
        System.out.println((b>=a && b>=c));
        System.out.println((c>=b && c>=a));
        
    
    }}