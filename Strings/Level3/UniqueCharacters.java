import java.util.Scanner;

public class UniqueCharacters {

    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {
        }
        return count;
    }

    public static char[] findUniqueCharacters(String text) {
        int n = getLength(text);
        char[] unique = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;
            for (int j = 0; j < index; j++) {
                if (unique[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) unique[index++] = c;
        }

        char[] result = new char[index];
        for (int i = 0; i < index; i++) result[i] = unique[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        char[] unique = findUniqueCharacters(text);
        System.out.println("Unique characters:");
        for (char c : unique) System.out.print(c + " ");
    }
}

