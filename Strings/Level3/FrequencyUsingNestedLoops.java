import java.util.Scanner;

public class FrequencyUsingNestedLoops {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {
        char[] chars = text.toCharArray();
        int n = chars.length;
        int[] freq = new int[n];

        // Initialize all frequencies
        for (int i = 0; i < n; i++) {
            freq[i] = 1;
        }

        // Outer loop: for each character
        for (int i = 0; i < n; i++) {
            if (chars[i] == '0') {
                continue; // already counted
            }
            // Inner loop: check duplicates
            for (int j = i + 1; j < n; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Count valid unique characters
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                uniqueCount++;
            }
        }

        // Store results in 1D String array
        String[] result = new String[uniqueCount];
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (chars[i] != '0') {
                result[index++] = chars[i] + " -> " + freq[i];
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyResult = findFrequency(text);

        System.out.println("\nCharacter Frequency (using nested loops):");
        for (String entry : frequencyResult) {
            System.out.println(entry);
        }
    }
}

