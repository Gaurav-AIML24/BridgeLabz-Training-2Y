public class ReplaceWord {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        return sentence.replace(oldWord, newWord);
    }

    public static void main(String[] args) {
        System.out.println(replaceWord("I love Java", "Java", "Python"));
    }
}
