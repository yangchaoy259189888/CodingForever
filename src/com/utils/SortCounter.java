package com.utils;

import java.util.Arrays;

/**
 * 计数器，验证排序算法正确性
 *
 * @author 西邮陈冠希
 * @date 2019/8/9
 **/
public class SortCounter {
    /**
     * 要测试的算法
     *
     * @param arr
     */
    private static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            int mid = partition(arr, L, R);
            quickSort(arr, L, mid - 1);
            quickSort(arr, mid + 1, R);
        }
    }

    private static int partition(int[] arr, int L, int R) {
        int i = L;
        int j = R;
        int base = arr[i];

        while (i < j) {
            while (arr[j] > base && i < j) {
                j--;
            }
            arr[i] = arr[j];
            while (arr[i] <= base && i < j) {
                i++;
            }
            arr[j] = arr[i];
        }
        arr[i] = base;
        return i;
    }

    /**
     * 交换两个数
     *
     * @param arr
     * @param i
     * @param j
     */
    private static void swap(int[] arr, int i, int j) {
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    /**
     * 时间复杂度很差，但是绝对正确的排序算法
     *
     * @param arr
     */
    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    /**
     * 生成一个长度随机，元素随机的数组
     *
     * @param maxSize 数组最大长度
     * @param maxValue 数组最大元素
     * @return
     */
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) (Math.random() * (maxSize + 1))];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * (maxValue + 1)) - (Math.random() * maxValue));
        }

        return arr;
    }

    /**
     * 拷贝一个和原随机数组一模一样的数组
     *
     * @param arr
     * @return
     */
    public static int[] copyArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[i];
        }

        return res;
    }

    /**
     * 判断两个数组是否一模一样
     *
     * @param arr1
     * @param arr2
     * @return
     */
    public static boolean isEqual(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }

    /**
     * 打印数组
     *
     * @param arr
     */
    public static void printArray(int[] arr) {
        if (arr == null) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int testTime = 100000;
        int maxSize = 10;
        int maxValue = 100;
        boolean succeed = true;

        for (int i = 0; i < testTime; i++) {
            int[] arr1 = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
            quickSort(arr1, 0, arr1.length - 1);
            comparator(arr2);
            if (!isEqual(arr1, arr2)) {
                succeed = false;
                break;
            }
        }
        System.out.println(succeed ? "OK" : "Fucking fucked");

        int[] arr = generateRandomArray(maxSize, maxValue);
        printArray(arr);
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
