package twosum;/*
 *
 * @author Lawshiga
 *
 */

public class Try2 {

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 11, 15, 7};
        twoSum(nums, 9);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for(int i=0; i<2; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < target) {
                for(int j=i+1; j<nums.length; j++) {
                    if(nums[i] + nums[j] == target) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return nums;
    }
}
