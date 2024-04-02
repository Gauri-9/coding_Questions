import java.util.*;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 2, 3, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));
    }

    public static int[] removeDuplicates(int[] array) {
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int num : array) {
            if (!set.contains(num)) {
                set.add(num);
                list.add(num);
            }
        }

        int[] uniqueArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            uniqueArray[i] = list.get(i);
        }

        return uniqueArray;
    }
}
