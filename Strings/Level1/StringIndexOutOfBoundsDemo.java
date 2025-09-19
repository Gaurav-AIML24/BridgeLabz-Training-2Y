public class StringIndexOutOfBoundsDemo {
    public static void generateException() {
        String text = "hello";
        System.out.println(text.charAt(10)); 
    }
    public static void handleException() {
        try {
            String text = "hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}

