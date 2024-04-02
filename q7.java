import java.util.*;

public class CommonElementsInArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 4, 5, 6, 7};

        System.out.println("Array 1: " + Arrays.toString(array1));
        System.out.println("Array 2: " + Arrays.toString(array2));

        Set<Integer> commonElements = findCommonElements(array1, array2);

        System.out.println("Common elements between the two arrays: " + commonElements);
    }

    public static Set<Integer> findCommonElements(int[] array1, int[] array2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> commonElements = new HashSet<>();

        // Add elements of array1 to set1
        for (int num : array1) {
            set1.add(num);
        }

        // Check elements of array2 against set1
        for (int num : array2) {
            if (set1.contains(num)) {
                commonElements.add(num);
            }
        }

        return commonElements;
    }
}
