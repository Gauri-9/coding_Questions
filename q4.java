import java.util.Arrays;

public class SortFirstHalfAscendingSecondHalfDescending {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 8, 3, 9, 4, 6};
        
        // Calculate the middle index of the array
        int middle = array.length / 2;
        
        // Sort the first half in ascending order
        Arrays.sort(array, 0, middle);
        
        // Sort the second half in descending order
        for (int i = middle; i < (array.length + middle) / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        // Print the sorted array
        System.out.println("Sorted array with first half in ascending and second half in descending:");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
