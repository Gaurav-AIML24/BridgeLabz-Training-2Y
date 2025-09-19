public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        String result = "";
        for (char c : str.toCharArray()) {
            if (result.indexOf(c) == -1) 
                result += c;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates("programming"));
    }
}

