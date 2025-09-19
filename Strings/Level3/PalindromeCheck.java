import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindrome1(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindrome2(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindrome2(text, start + 1, end - 1);
    }

    public static boolean isPalindrome3(String text) {
        StringBuilder rev = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) rev.append(text.charAt(i));
        return text.equals(rev.toString());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        System.out.println("Logic 1 (Iterative): " + isPalindrome1(text));
        System.out.println("Logic 2 (Recursive): " + isPalindrome2(text, 0, text.length() - 1));
        System.out.println("Logic 3 (Char Array): " + isPalindrome3(text));
    }
}

