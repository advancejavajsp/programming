package string;

public class CountVowelDigitSpecial {
    public static void main(String[] args) {
        String str = "Hello123@#World!";
        int vowels = 0, digits = 0, special = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Vowels
            if ((ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
                vowels++;
            }
            // Digits
            else if (ch >= '0' && ch <= '9') {
                digits++;
            }
            // Special Characters
            else if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))) {
                special++;
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Digits: " + digits);
        System.out.println("Special Characters: " + special);
    }
}

