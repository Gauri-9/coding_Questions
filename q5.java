import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 1, 8, 3, 9, 4, 6};

        System.out.println("Original array: " + Arrays.toString(array));

        reverseArray(array);

        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;

            // Move to the next pair of elements
            start++;
            end--;
        }
    }
}
