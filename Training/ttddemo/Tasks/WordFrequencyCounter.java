import java.io.*;
import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        // Create a HashMap to store word-frequency pairs
        Map<String, Integer> wordFrequencyMap = new HashMap<>();

        // Read input file and count word frequencies
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Remove punctuation and convert to lowercase
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();
                    if (!word.isEmpty()) {
                        wordFrequencyMap.put(word, wordFrequencyMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading the input file: " + e.getMessage());
            return;
        }

        // Write word-frequency pairs to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            for (Map.Entry<String, Integer> entry : wordFrequencyMap.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }
            System.out.println("Word frequencies written to " + outputFile);
        } catch (IOException e) {
            System.err.println("Error writing to the output file: " + e.getMessage());
        }
    }
}