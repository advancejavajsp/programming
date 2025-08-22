package ds;

import java.util.HashSet;

public class LongestSubstring {

    public static String longestUniqueSubstr(String s) {
       
        int maxLength = 0;
        int start = 0;

        int left = 0;
        HashSet<Character> set = new HashSet<>();
        String longestSub = "";

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            // If character is already in the set, remove from the left
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(currentChar);

            // Update max length and substring
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
                longestSub = s.substring(left, right + 1);
            }
           
        }
        System.out.println(longestSub);
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input = "abcabcxyzcredbb";
        String result = longestUniqueSubstr(input);
        System.out.println("Longest substring without repeating characters: " + result);
    }
}

