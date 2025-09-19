public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--)
            rev += str.charAt(i);
        return str.equals(rev);
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Madam") ? "Palindrome" : "Not Palindrome");
    }
}
