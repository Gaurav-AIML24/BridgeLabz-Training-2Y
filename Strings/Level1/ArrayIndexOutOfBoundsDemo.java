public class ArrayIndexOutOfBoundsDemo {
    public static void generateException() {
        String[] names = {"A", "B", "C"};
        System.out.println(names[5]); 
    }
    public static void handleException() {
        try {
            String[] names = {"A", "B", "C"};
            System.out.println(names[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        handleException();
    }
}

