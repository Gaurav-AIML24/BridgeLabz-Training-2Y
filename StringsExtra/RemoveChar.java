public class RemoveChar {
    public static String removeChar(String str, char ch) {
        return str.replace(Character.toString(ch), "");
    }

    public static void main(String[] args) {
        System.out.println("Modified String: " + removeChar("Hello World", 'l'));
    }
}
