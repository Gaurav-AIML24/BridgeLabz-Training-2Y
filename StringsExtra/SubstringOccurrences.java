public class SubstringOccurrences {
    public static int countOccurrences(String str, String sub) {
        int count = 0, index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println("Occurrences: " + countOccurrences("banana", "ana"));
    }
}
