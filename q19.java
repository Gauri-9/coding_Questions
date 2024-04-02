import java.util.HashMap;

public class TwoSum {
    public static int[] findIndices(int[] nums, int target) {
        // Create a HashMap to store the complement of each element and its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            // If the complement exists in the map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            // Otherwise, add the current element and its index to the map
            map.put(nums[i], i);
        }

        // If no such pair is found, return {-1, -1}
        return new int[] { -1, -1 };
    }

    public static void main(String[] args) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        int[] indices = findIndices(nums, target);
        if (indices[0] != -1 && indices[1] != -1) {
            System.out.println("Indices: " + indices[0] + ", " + indices[1]);
            System.out.println("Values: " + nums[indices[0]] + ", " + nums[indices[1]]);
        } else {
            System.out.println("No such pair found.");
        }
    }
}
