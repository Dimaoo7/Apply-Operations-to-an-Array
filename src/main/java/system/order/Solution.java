package system.order;

import java.util.Arrays;

class Solution {
    public static void main(String[] args){

        int[] nums = {1, 2, 2, 1, 1, 0};

        System.out.println(Arrays.toString(applyOperations(nums)));

    }

    public static int[] applyOperations(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2;
                nums[i + 1] = 0;
            }
        }
        int[] result = new int[nums.length];
        int nonZeroIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }
        return result;
    }
}