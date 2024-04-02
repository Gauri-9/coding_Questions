public class VowelConsonantCounter {
    public static void main(String[] args) {
        String inputString = "Hello World";
        int vowels = 0;
        int consonants = 0;
        
        // Convert the input string to lowercase for case-insensitive comparison
        inputString = inputString.toLowerCase();
        
        // Iterate through each character of the string
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            
            // Check if the character is a letter
            if (Character.isLetter(ch)) {
                // Check if the character is a vowel
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
