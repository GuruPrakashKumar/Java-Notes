import java.util.*;
public class minimalOperation {  
    public static List<Integer> minimalOperations(List<String> words) {
        List<Integer> result = new ArrayList<>();
        for (String word : words) {
            int changes = 0;
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(i - 1)) {
                    changes++;
                    i++;
                }
            }       
            result.add(changes);
        }  
        return result;
    }
    public static void main(String[] args) {
        // Test cases
        List<String> words = Arrays.asList("aaabbb", "aaaabbb", "aaabbb");
        List<Integer> result = minimalOperations(words);
        System.out.println(result);  // Output: [1, 1, 0]
    }
}