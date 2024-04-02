import java.util.*;

public class UniqueNumbersInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 9, 10, 10};

        System.out.println("Original array: " + Arrays.toString(array));

        Set<Integer> uniqueNumbers = findUniqueNumbers(array);

        System.out.println("Unique numbers in the array: " + uniqueNumbers);
    }

    public static Set<Integer> findUniqueNumbers(int[] array) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (int num : array) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        return uniqueNumbers;
    }
}
