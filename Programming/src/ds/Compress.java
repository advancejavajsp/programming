package ds;

public class Compress {

    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        String s1 = "";
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                s1 = s1 + str.charAt(i - 1) + count;
                count = 1;
            }
        }

        
        s1 = s1 + str.charAt(str.length() - 1) + count;

        return s1;
    }

    public static void main(String[] args) {
        String input = "aabcccccaaa";
        String result = compress(input);
        System.out.println("Compressed string: " + result);
    }
}

