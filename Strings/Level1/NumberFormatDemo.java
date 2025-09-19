public class NumberFormatDemo {
    public static void generateException() {
        String text = "abc123";
        int num = Integer.parseInt(text); // not a number
        System.out.println(num);
    }
    public static void handleException() {
        try {
            String text = "abc123";
            int num = Integer.parseInt(text);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}

