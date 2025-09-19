import java.util.Scanner;

public class CalendarDisplay {

    static String[] monthNames = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    static int[] monthDays = {
        31, 28, 31, 30, 31, 30,
        31, 31, 30, 31, 30, 31
    };

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return monthDays[month - 1];
    }

    public static String getMonthName(int month) {
        return monthNames[month - 1];
    }

    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year -= 1;
        }
        int q = 1;
        int m = month;
        int k = year % 100;
        int j = year / 100;

        int h = (q + (13 * (m + 1)) / 5 + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (h + 6) % 7; 
    }

    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int days = getDaysInMonth(month, year);
        int startDay = getFirstDayOfMonth(month, year);

        System.out.printf("\n     %s %d\n", monthName, year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        for (int i = 0; i < startDay; i++) {
            System.out.print("    ");
        }

        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + startDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter month (1–12): ");
            int month = scanner.nextInt();

            System.out.print("Enter year: ");
            int year = scanner.nextInt();

            if (month < 1 || month > 12 || year < 1) {
                System.out.println("Invalid input. Please enter a valid month and year.");
                return;
            }

            displayCalendar(month, year);
        }
    }
}
