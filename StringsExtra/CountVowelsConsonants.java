public class CountVowelsConsonants {
    public static void countVC(String str) {
        str = str.toLowerCase();
        int vowels = 0, consonants = 0;

        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                if ("aeiou".indexOf(c) != -1)
                    vowels++;
                else
                    consonants++;
            }
        }
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static void main(String[] args) {
        countVC("Hello World");
    }
}
