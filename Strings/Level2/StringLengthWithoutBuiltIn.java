import java.util.Scanner;
public class StringLengthWithoutBuiltIn {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); 
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();
        int manualLength = findLength(input);
        int builtInLength = input.length();
        System.out.println("Length using manual method: " + manualLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}

