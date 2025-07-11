package string;

public class Panagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy dog";
        boolean[] present = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

           
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char)(ch + 32);
            }

           
            if (ch >= 'a' && ch <= 'z') {
                present[ch - 'a'] = true;
            }
        }

        boolean isPangram = true;
        for (int i = 0; i < 26; i++) {
            if (!present[i]) {
                isPangram = false;
                break;
            }
        }

        System.out.println(isPangram ? "Pangram" : "Not Pangram");
    }
}

