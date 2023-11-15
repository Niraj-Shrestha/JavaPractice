package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FindDuplicateWordInSentence {
    public static void main(String[] args) {
        String Sentence = "This is niraj shrestha niraj This";
        duplicateWordCountWithHashMap(Sentence);
        duplicateWordCountWithLoops(Sentence);
    }

    static void duplicateWordCountWithHashMap(String Sentence){
        HashMap<String, Integer> wordCount = new HashMap<>();

        String[] Words =  Sentence.split("\\s+");
        for(String word : Words){
            wordCount.put(word,wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            if (wordCount.get(word) > 1) {
                System.out.println("'" + word + "' appears " + wordCount.get(word) + " times.");
            }
        }
    }

    static void duplicateWordCountWithLoops(String Sentence){
        String[] Words =  Sentence.split("\\s+");
        List<String> wordList = Arrays.stream(Words).toList();
        System.out.println(Arrays.stream(Words).toList());
        for(int i =0; i < wordList.size(); i++){
            String word=wordList.get(i);

            int wordCount = 1;

            for(int j = 0; j < i; j++){
                String pw=wordList.get(j);
                if (pw.equals(word)) {
                    wordCount++;
                }
            }
            if (wordCount>1) {
                System.out.println("The word '" + word + "' is repeated. " +wordCount+" times");
            }
        }
    }
}
