import java.util.Scanner;
public class WordsWithLength {
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
    public static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] words = manualSplit(text);
        String[][] result = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (String[] row : result) {
            System.out.println(row[0] + "\t" + Integer.parseInt(row[1]));
        }
    }
}

