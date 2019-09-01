package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/2
 **/
public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for (int i = 0; i < length;) {
            if (nums[i] == val) {
                int temp = nums[i];
                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                nums[nums.length - 1] = temp;
                length--;
            } else {
                i++;
            }
        }

        return length;
    }

    public static int removeElement1(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;

        int i = removeElement1(nums, val);
        System.out.println(i);
    }
}
