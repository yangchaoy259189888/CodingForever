package com.offer;

import java.util.ArrayList;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2019/2/11 23:25
 * @Description: 不修改数组找出重复的数字（任意一个重复的数字）
 **/
public class Test3_2_1 {
    public ArrayList<Integer> getDuplication(int[] numbers) {
        if (numbers == null) {
            return null;
        }

        int[] temp = new int[8];
        ArrayList<Integer> duplication = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            temp[numbers[i]]++;
        }
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] > 1) {
                duplication.add(i);
            }
        }

        return duplication;
    }

    public static void main(String[] args) {
//        int[] numbers = {2, 3, 5, 4, 1, 2, 6, 7};
        int[] numbers = null;
        ArrayList<Integer> duplication;

        duplication = new Test3_2_1().getDuplication(numbers);
        for (Integer integer : duplication) {
            System.out.println(integer);
        }
    }
}
