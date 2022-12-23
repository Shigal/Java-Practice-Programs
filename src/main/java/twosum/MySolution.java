package twosum;/*
 *
 * @author Lawshiga
 *
 */

public class MySolution {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 11, 15, 7};
//        nums = twoSum(nums, 9);
//        printArray(nums);

        ActualSolution solution = new ActualSolution();
        solution.twoSum(nums, 9);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for(int i=0; i<2; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                if(nums[i] + nums[j] == target) {
                    nums[0] = i;
                    nums[1] = j;
                    break;
                }
            }
        }
        return nums;
    }
}
