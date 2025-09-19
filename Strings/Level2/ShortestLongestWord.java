import java.util.Scanner;
public class ShortestLongestWord {
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {}
        return count;
    }
    public static String[] manualSplit(String text) {
        int len = findLength(text);
        int spaces = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') spaces++;
        }
        String[] words = new String[spaces];
        int wordIndex = 0;
        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = text.charAt(i);
            if (ch == ' ') {
                words[wordIndex++] = word;
                word = "";
            } else {
                word += ch;
            }
        }
        words[wordIndex] = word;
        return words;
    }
    public static String[] findShortestLongest(String[] words) {
        String shortest = words[0], longest = words[0];
        for (String word : words) {
            if (findLength(word) < findLength(shortest)) {
                shortest = word;
            }
            if (findLength(word) > findLength(longest)) {
                longest = word;
            }
        }
        return new String[]{shortest, longest};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[] result = findShortestLongest(words);
        System.out.println("Shortest word: " + result[0]);
        System.out.println("Longest word: " + result[1]);
    }
}
