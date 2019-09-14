package com.offer.simple;

import java.util.*;

/**
 * @author 西邮陈冠希
 * @date 2019/8/30
 **/
public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) == null) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

//        List<Integer> list = new ArrayList<>(map.keySet());
//        Collections.sort(list);
//        for (int i = 0; i < list.size(); i++) {
//            nums[i] = list.get(i);
//        }

        return map.size();
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int len = removeDuplicates(nums);
        System.out.println(len);
    }
}
