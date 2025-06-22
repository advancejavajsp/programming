package map;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String sentence = "Java is easy and Java is powerful";
        String word = "";
        Map<String, Integer> wordMap = new HashMap<>();

        sentence = sentence + " "; 

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else if (!word.isEmpty()) {
                
                if (wordMap.containsKey(word)) {
                    wordMap.put(word, wordMap.get(word) + 1);
                } else {
                    wordMap.put(word, 1);
                }
                word = ""; 
            }
        }

        // Print word frequencies
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

