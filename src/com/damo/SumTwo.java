package com.damo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * 假设数组int[] array = {2, 7, 11, 15}，target = 9，
 * 找出数组中是否存在array[i] + array[j] = target，i不等于j，如果有，返回[i, j]，没有则返回0。
 *
 * @author 西邮陈冠希
 * @date 2019/7/26
 **/
public class SumTwo {

    private static int[] sumTwoNum(int[] array, int target) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }

            }
        }

        return null;
    }

    private static int[] sumTwoNum2(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            Integer integer = map.get(array[i]);
            if (null != integer) {
                return new int[]{integer, i};
            }
            map.put(target - array[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] array = {2, 7, 11, 15};
        int target = 18;

        System.out.println(Arrays.toString(sumTwoNum(array, target)));
        System.out.println(Arrays.toString(sumTwoNum2(array, target)));
    }
}
