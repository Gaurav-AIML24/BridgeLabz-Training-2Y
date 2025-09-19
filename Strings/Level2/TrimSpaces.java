import java.util.Scanner;
public class TrimSpaces {
    public static String trimString(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }
        return text.substring(start, end + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text with spaces: ");
        String text = sc.nextLine();
        String trimmed = trimString(text);
        System.out.println("Original: [" + text + "]");
        System.out.println("Trimmed: [" + trimmed + "]");
    }
}
