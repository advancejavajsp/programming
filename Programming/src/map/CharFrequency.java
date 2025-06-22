package map;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String str = "hello world";
        Map<Character, Integer> frequencyMap = new HashMap<>();

       
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

          
            if (ch == ' ') continue;

           
            if (frequencyMap.containsKey(ch)) {
                frequencyMap.put(ch, frequencyMap.get(ch) + 1);
            } else {
                frequencyMap.put(ch, 1);
            }
        }

        System.out.println(frequencyMap);
        // Print frequencies
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' : " + entry.getValue());
        }
    }
}

