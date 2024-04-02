public class MissingElementInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 5, 6};

        int missingNumber = findMissingNumber(array, array.length + 1);
        System.out.println("The missing element in the array is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        // Calculate the expected sum of all elements from 1 to n
        int expectedSum = n * (n + 1) / 2;

        // Calculate the actual sum of elements in the array
        int actualSum = 0;
        for (int num : array) {
            actualSum += num;
        }

        // The difference between expected sum and actual sum is the missing element
        return expectedSum - actualSum;
    }
}
