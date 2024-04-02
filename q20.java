public class HighestRepeatedLetterWordFinder {
    public static String findWordWithHighestRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        int maxRepeatedLetters = 0;
        String wordWithMaxRepeatedLetters = "";

        for (String word : words) {
            int[] letterCount = new int[26]; // Assuming only lowercase letters are considered

            // Count occurrences of each letter in the word
            for (char c : word.toCharArray()) {
                letterCount[c - 'a']++;
            }

            // Find the maximum count of repeated letters in the word
            int maxCount = 0;
            for (int count : letterCount) {
                if (count > 1 && count > maxCount) {
                    maxCount = count;
                }
            }

            // Check if the current word has more repeated letters than the previous maximum
            if (maxCount > maxRepeatedLetters) {
                maxRepeatedLetters = maxCount;
                wordWithMaxRepeatedLetters = word;
            }
        }

        // If no word has repeated letters, return -1
        if (maxRepeatedLetters == 0) {
            return "-1";
        }

        return wordWithMaxRepeatedLetters;
    }

    public static void main(String[] args) {
        String input = "hello world apple banana";
        String result = findWordWithHighestRepeatedLetters(input);
        System.out.println("Word with highest repeated letters: " + result);
    }
}
