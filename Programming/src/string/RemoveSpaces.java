package string;

public class RemoveSpaces {
    public static void main(String[] args) {
        String str = "Java is fun";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch != ' ') {
                result += ch;
            }
        }

        System.out.println("String without spaces: " + result);
    }
}
//note trim() used to remove trailing and leading space
