package com.leetcode.soluton.twopointer;

public class RemoveDuplicates {

    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }

    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0)
            return 0;

        int i = 1;

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i - 1]) {
                nums[i] = nums[j];
                i++;
            }
        }
        return i;
    }
}
