import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words. This string will be used to count the number of words in it.";
        
       
        inputString = inputString.replaceAll("[^a-zA-Z ]", "").toLowerCase();
        
     
        String[] words = inputString.split("\\s+");
        
   
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        
  
        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        
       
        System.out.println("Word counts:");
        for (String word : wordCountMap.keySet()) {
            System.out.println(word + ": " + wordCountMap.get(word));
        }
        
       
        System.out.println("Total number of words: " + words.length);
    }
}
