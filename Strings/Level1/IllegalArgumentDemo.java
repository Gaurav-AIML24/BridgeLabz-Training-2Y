public class IllegalArgumentDemo {
    public static void generateException() {
        String text = "hello";
        System.out.println(text.substring(4, 2)); 
    }
    public static void handleException() {
        try {
            String text = "hello";
            System.out.println(text.substring(4, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}
