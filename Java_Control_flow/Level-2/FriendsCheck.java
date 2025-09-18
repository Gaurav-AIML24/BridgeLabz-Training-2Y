import java.util.Scanner;
class FriendsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt(), height1 = sc.nextInt();
        int age2 = sc.nextInt(), height2 = sc.nextInt();
        int age3 = sc.nextInt(), height3 = sc.nextInt();
        if (age1 < age2 && age1 < age3) System.out.println("Amar is youngest");
        else if (age2 < age1 && age2 < age3) System.out.println("Akbar is youngest");
        else System.out.println("Anthony is youngest");
        if (height1 > height2 && height1 > height3) System.out.println("Amar is tallest");
        else if (height2 > height1 && height2 > height3) System.out.println("Akbar is tallest");
        else System.out.println("Anthony is tallest");
        sc.close();
    }
}
