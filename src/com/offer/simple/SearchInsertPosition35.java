package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/3
 **/
public class SearchInsertPosition35 {
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    //二分
    public static int searchInsert2(int[] nums, int target) {
        int L = 0;
        int R = nums.length - 1;

        while (L <= R) {
            int mid = L + ((R - L) >> 1);
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                R = mid - 1;
            } else {
                L = mid + 1;
            }
        }
        return L;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 6};
        int val = 0;
        int i = searchInsert2(arr, val);
        System.out.println(i);
    }
}
