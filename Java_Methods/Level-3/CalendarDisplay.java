import java.util.Scanner;

public class CalendarDisplay {

    // Array of month names
    static String[] months = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month
    static int[] daysInMonth = {
        0, 31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    // Check for leap year
    public static boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month];
    }

    // Zeller’s Congruence to find first day of month (0=Saturday, 1=Sunday, ..., 6=Friday)
    public static int getFirstDayOfMonth(int month, int year) {
        int q = 1; // first day of month
        if (month == 1) {
            month = 13;
            year--;
        } else if (month == 2) {
            month = 14;
            year--;
        }
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (month + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        // Convert so that 0=Sunday, 1=Monday, ..., 6=Saturday
        int dayOfWeek = ((h + 6) % 7);
        return dayOfWeek;
    }

    // Display calendar
    public static void printCalendar(int month, int year) {
        System.out.println("     " + months[month] + " " + year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        int firstDay = getFirstDayOfMonth(month, year);
        int days = getDaysInMonth(month, year);

        // Indentation before 1st day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%4d", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // next line after Saturday
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        printCalendar(month, year);

        sc.close();
    }
}