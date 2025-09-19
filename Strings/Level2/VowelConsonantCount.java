import java.util.Scanner;
public class VowelConsonantCount {
    public static String checkCharType(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32); // convert to lowercase

        if (ch >= 'a' && ch <= 'z') {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                return "Vowel";
            else
                return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            String type = checkCharType(text.charAt(i));
            if (type.equals("Vowel")) vowels++;
            else if (type.equals("Consonant")) consonants++;
        }

        return new int[]{vowels, consonants};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();
        int[] result = countVowelsConsonants(text);
        System.out.println("Vowels: " + result[0]);
        System.out.println("Consonants: " + result[1]);
    }
}

