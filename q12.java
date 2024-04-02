public class RotateArrayLeft {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        printArray(array);
        
        rotateLeft(array);
        
        System.out.println("Array after rotating left by 1 position:");
        printArray(array);
    }

    public static void rotateLeft(int[] array) {
        if (array.length <= 1) {
            // No need to rotate if the array has 0 or 1 element
            return;
        }
        
        // Store the first element of the array
        int firstElement = array[0];
        
        // Shift all elements one position to the left
        for (int i = 1; i < array.length; i++) {
            array[i - 1] = array[i];
        }
        
        // Move the first element to the last position
        array[array.length - 1] = firstElement;
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
