import java.util.Scanner;
public class SplitWordsCompare {
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
        int spaces = 1; // at least one word
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
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();
        String[] manual = manualSplit(text);
        String[] builtIn = text.split(" ");
        System.out.println("Manual split: ");
        for (String w : manual) System.out.print(w + " ");
        System.out.println();
        System.out.println("Built-in split: ");
        for (String w : builtIn) System.out.print(w + " ");
        System.out.println();
        System.out.println("Are both equal? " + compareArrays(manual, builtIn));
    }
}
