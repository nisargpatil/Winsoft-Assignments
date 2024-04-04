//Count the words in string
//WordCounter.java

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
    public static void main(String[] args) {
        String text = "Hello Mam Hello Sir Welcome To Winsoft Technologies !";
        Map<String, Integer> wordCount = countWords(text);
        displayCount(wordCount);
    }

    public static Map<String, Integer> countWords(String text) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = text.split("\\s+");
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void displayCount(Map<String, Integer> wordCount) {
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}