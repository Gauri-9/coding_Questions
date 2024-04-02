public class RotateArrayLeftByK {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int k = 2; // Number of positions to rotate

        System.out.println("Original Array:");
        printArray(array);

        rotateLeftByK(array, k);

        System.out.println("Array after rotating left by " + k + " positions:");
        printArray(array);
    }

    public static void rotateLeftByK(int[] array, int k) {
        if (array.length <= 1) {
            // No need to rotate if the array has 0 or 1 element
            return;
        }

        k %= array.length; // Adjust k if it's greater than array length

        reverseArray(array, 0, k - 1); // Reverse the first part of the array
        reverseArray(array, k, array.length - 1); // Reverse the second part of the array
        reverseArray(array, 0, array.length - 1); // Reverse the entire array
    }

    public static void reverseArray(int[] array, int start, int end) {
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
