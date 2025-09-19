import java.util.Scanner;

public class FrequencyOfCharacters {

    // Method to find unique characters using nested loops
    public static char[] uniqueCharacters(String text) {
        int n = text.length();
        char[] temp = new char[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            char c = text.charAt(i);
            boolean found = false;

            // check if already added
            for (int j = 0; j < index; j++) {
                if (temp[j] == c) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                temp[index++] = c;
            }
        }

        // copy only unique characters into result array
        char[] unique = new char[index];
        for (int i = 0; i < index; i++) {
            unique[i] = temp[i];
        }
        return unique;
    }

    // Method to find frequency of characters
    public static String[][] findFrequency(String text) {
        int[] freq = new int[256]; // for ASCII characters

        // count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // get unique characters
        char[] unique = uniqueCharacters(text);

        // create 2D array for result
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyTable = findFrequency(text);

        System.out.println("\nCharacter Frequency:");
        System.out.printf("%-10s %-10s\n", "Char", "Count");
        for (String[] row : frequencyTable) {
            System.out.printf("%-10s %-10s\n", row[0], row[1]);
        }
    }
}
