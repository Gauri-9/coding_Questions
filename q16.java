public class PangramChecker {
    public static boolean isPangram(String sentence) {
        // Convert the sentence to lowercase to make the comparison case-insensitive
        sentence = sentence.toLowerCase();
        
        // Create a boolean array to store whether each letter of the alphabet is present
        boolean[] alphabetPresent = new boolean[26];
        
        // Iterate over each character in the sentence
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            // Check if the character is a letter of the alphabet
            if (c >= 'a' && c <= 'z') {
                // Mark the corresponding letter as present in the array
                alphabetPresent[c - 'a'] = true;
            }
        }
  
