import java.util.Scanner;
class Countdown {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>=1){
            System.out.println(a);
            a--;
        }
        
        sc.close();
    }
}
