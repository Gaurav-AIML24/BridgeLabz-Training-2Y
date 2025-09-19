public class MostFrequentChar {
    public static char findMostFrequent(String str) {
        int[] freq = new int[256];
        for (char c : str.toCharArray())
            freq[c]++;
        
        int max = -1;
        char result = ' ';
        for (char c : str.toCharArray()) {
            if (freq[c] > max) {
                max = freq[c];
                result = c;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Most Frequent Character: " + findMostFrequent("success"));
    }
}
