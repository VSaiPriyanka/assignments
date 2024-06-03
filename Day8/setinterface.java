import java.util.HashSet;
import java.util.Set;

public class setinterface {
    public static void main(String[] args) {
        String input = "This is a sample sentence for testing unique words in Java";
        Set<String> uniqueWords = new HashSet<>();

        // Add words from the input string to the set
        for (String word : input.split("\\s+")) {
            uniqueWords.add(word);
        }

        // Print the number of unique words
        System.out.println("Number of unique words: " + uniqueWords.size());

        // Print the unique words
        System.out.println("Unique words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }
    }
}