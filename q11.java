public class RemoveNonAlphabeticCharacters {
    public static void main(String[] args) {
        String input = "Hello!123, how are you?";
        String result = removeNonAlphabetic(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing non-alphabetic characters: " + result);
    }

    public static String removeNonAlphabetic(String input) {
        // Regular expression to match alphabetic characters
        String regex = "[^a-zA-Z]";
        // Replace non-alphabetic characters with empty string
        return input.replaceAll(regex, "");
    }
}
