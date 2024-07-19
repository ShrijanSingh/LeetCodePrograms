package LeetCode;
import java.util.Arrays;
public class ArrayPartition {
    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums); // Sort the array in ascending order
        int sum = 0;
        // Sum up every second number starting from the first index (0-based)
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] nums = {6, 2, 6, 5,1,2}; // Example input
        int result = arrayPairSum(nums);
        System.out.println("Maximized sum: " + result);
    }
}
