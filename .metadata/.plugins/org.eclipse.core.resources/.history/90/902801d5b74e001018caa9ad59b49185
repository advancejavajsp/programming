package string;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            boolean found = false;

            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == current) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                result += current;
            }
        }

        System.out.println("Original String: " + input);
        System.out.println("After Removing Duplicates: " + result);
    }
}

