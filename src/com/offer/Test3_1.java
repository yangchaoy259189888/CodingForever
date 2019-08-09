package com.offer;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2019/2/10 23:30
 * @Description: 数组中找重复的元素
 **/
public class Test3_1 {
    public static boolean duplicate(int numbers[], int length, int[] duplication) {
        if (numbers == null || length <= 0) {
            return false;
        }

        for (int i = 0; i < length; i++) {
            if (numbers[i] < 0 || numbers[i] > length - 1) {
                return false;
            }
        }

        for (int i = 0; i < length; i++) {
            while (numbers[i] != i) {
                if (numbers[i] == numbers[numbers[i]]) {
                    duplication[0] = numbers[i];
                    return true;
                }
                int temp = numbers[i];
                numbers[i] = numbers[temp];
                numbers[temp] = temp;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 1, 0, 2, 5, 3};
        int[] duplication = {0};
        boolean flag;

        flag = duplicate(numbers, numbers.length, duplication);
        System.out.println(flag + " " + duplication[0]);
    }
}
