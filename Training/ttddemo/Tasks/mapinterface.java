import java.util.HashMap;
import java.util.Map;

public class mapinterface {
    
    public static Map<String, Integer> countWordFrequency(String text) {
        Map<String, Integer> frequencyMap = new HashMap<>();
        
        // Split the text into words
        String[] words = text.split("\\s+");
        
        // Count the frequency of each word
        for (String word : words) {
            // Remove any punctuation marks
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
            
            // If the word is not empty after removing punctuation
            if (!word.isEmpty()) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }
        
        return frequencyMap;
    }
    
    public static void main(String[] args) {
        String text = "This is a sample text, with some words. This text will be used to demonstrate the word frequency counter.";
        Map<String, Integer> frequencyMap = countWordFrequency(text);
        
        // Print the word frequencies
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}