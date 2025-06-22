package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "aabbccdxee";
        Map<Character, Integer> charMap = new LinkedHashMap<>();

        // Count frequency
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            charMap.put(ch, charMap.getOrDefault(ch, 0) + 1);
        }

        // Find first non-repeating
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("First Non-Repeating Character: " + entry.getKey());
                return;
            }
        }

        System.out.println("No non-repeating character found.");
    }
}

