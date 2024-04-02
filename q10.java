public class MaxOnesInRow {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 1, 0, 0, 1},
            {1, 1, 1, 0, 0},
            {1, 0, 0, 0, 1},
            {1, 1, 1, 1, 1}
        };

        int[] maxOnesRows = findMaxOnesRows(matrix);
        
        System.out.println("Rows with maximum number of 1's:");
        for (int row : maxOnesRows) {
            System.out.println(row);
        }
    }

    public static int[] findMaxOnesRows(int[][] matrix) {
        int maxOnesCount = 0;
        int[] maxOnesRows = new int[matrix.length];
        int index = 0;

        for (int i = 0; i < matrix.length; i++) {
            int onesCount = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    onesCount++;
                }
            }
            if (onesCount > maxOnesCount) {
                maxOnesCount = onesCount;
                index = 0;
                maxOnesRows[index++] = i;
            } else if (onesCount == maxOnesCount) {
                maxOnesRows[index++] = i;
            }
        }
        // Truncate the array to remove any unused slots
        return java.util.Arrays.copyOf(maxOnesRows, index);
    }
}
