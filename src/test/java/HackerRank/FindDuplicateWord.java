package HackerRank;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FindDuplicateWord {
    public static void main(String[] args) {
        String filePath = "your_file.txt"; // Specify the path to your text file.

        // Create a HashMap to store word frequencies.
        HashMap<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath)) ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split the line into words using whitespace as a delimiter.

                for (String word : words) {
                    // Remove punctuation (optional) and convert to lowercase.
                    word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

                    // Update the word count in the HashMap.
                    if (!word.isEmpty()) {
                        wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Print duplicate words and their frequencies.
        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println("'" + word + "' appears " + wordCount.get(word) + " times.");
            }
        }
    }
}
