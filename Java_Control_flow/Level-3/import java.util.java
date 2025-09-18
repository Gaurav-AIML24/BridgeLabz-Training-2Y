import java.util.Scanner;

class DayOfWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter month (1=Jan, 2=Feb...): ");
        int m = input.nextInt();
        System.out.print("Enter day: ");
        int d = input.nextInt();
        System.out.print("Enter year: ");
        int y = input.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        System.out.println("Day of Week (0=Sunday, 1=Monday...6=Saturday): " + d0);

        input.close();
    }
}
