package twosum;/*
 *
 * @author Lawshiga
 *
 */

public class ActualSolution {
    public int[] twoSum(int[] nums, int target) {

        // Time complexity is O(n2)
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
}
