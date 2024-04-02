import java.util.Arrays;

public class AnagramChecker {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        boolean result = areAnagrams(str1, str2);

        if (result) {
            System.out.println("'" + str1 + "' and '" + str2 + "' are anagrams.");
        } else {
            System.out.println("'" + str1 + "' and '" + str2 + "' are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        // Check if both strings have the same length
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert strings to character arrays
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        // Sort character arrays
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Compare sorted strings
        return Arrays.equals(charArray1, charArray2);
    }
}
