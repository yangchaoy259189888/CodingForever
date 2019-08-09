package com.offer;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2019/2/11 22:29
 * @Description: 不修改数组找出重复的数字（任意一个重复的数字）
 **/
public class Test3_2 {
    public int countRange(int[] numbers, int length, int start, int end) {
        if (numbers == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < length; i++) {
            if (numbers[i] >= start && numbers[i] <= end) {
                ++count;
            }
        }

        return count;
    }

    public int getDuplication(int[] numbers, int length) {
        if (numbers == null || length <= 0) {
            return -1;
        }

        int start = 1;
        int end = length - 1;
        while (end >= start) {
            System.out.println("start = " + start + ", " + "end = " + end);
            int middle = ((end - start) >> 1) + start;
            System.out.println("middle = " + middle);
            int count = countRange(numbers, length, start, middle);
            System.out.println("count = " + count + "\n");
            if (end == start) {
                if (count > 1) {
                    return start;
                } else {
                    break;
                }
            }

            if (count > middle - start + 1) {
                end = middle;
            } else {
                start = middle + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 4, 3, 2, 6, 7};
        int duplication;

        duplication = new Test3_2().getDuplication(numbers, numbers.length);
//        System.out.println(duplication);
    }
}
