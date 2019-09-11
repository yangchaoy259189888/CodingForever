package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/10
 **/
public class Maximum_Subarray {
    public static int maxSubArray(int[] nums) {
        int res = nums[0];
        int sum = 0;
        for (int num : nums) {
            if (sum > 0) {
                sum += num;
            } else {
                sum = num;
            }
            res = Math.max(res, sum);
        }

        return res;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int i = maxSubArray(nums);
        System.out.println(i);
    }
}
