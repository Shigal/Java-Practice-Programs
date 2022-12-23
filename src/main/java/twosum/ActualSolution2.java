package twosum;/*
 *
 * @author Lawshiga
 *
 */

import java.util.HashMap;
import java.util.Map;

public class ActualSolution2 {
    // use HashMap -super fast O(c) - constant time
    // Key - remainder(target - current element)
    // value - index of current element

    // {2, 5, 8, 11, 15, 7} , 9
    // K -> V
    // 7 -> 0
    // 4 -> 1
    // 1 -> 2
    // 11 x
    // 15 x
    // 7 ~

    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 11, 15, 7};
        finaTwoSum(nums, 9);
        printArray(nums);

    }

    private static void printArray(int[] nums) {
        for(int i=0; i<2; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(nums[i] < target) {
                map.put(target - nums[i], i);
            }
            if(map.containsKey(nums[i])) {
                return new int[] {map.get(nums[i]), i};
            }
        }
        return nums;
    }

    // O(n)
    public static int[] finaTwoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            Integer complementIndex = map.get(nums[i]);
            if(complementIndex != null) {
                return new int[] {complementIndex, i};
            }
            map.put(target - nums[i], i);
        }

        return nums;
    }
}
