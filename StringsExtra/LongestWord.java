public class LongestWord {
    public static String findLongest(String sentence) {
        String[] words = sentence.split(" ");
        String longest = "";
        for (String w : words) {
            if (w.length() > longest.length())
                longest = w;
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println("Longest Word: " + findLongest("Java is amazing language"));
    }
}
