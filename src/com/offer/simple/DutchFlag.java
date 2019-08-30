package com.offer.simple;

/**
 * 给定一个数组arr，和一个数num，请把小于num的数放在数组的
 * 左边，等于num的数放在数组的中间，大于num的数放在数组的
 * 右边。
 * 要求额外空间复杂度O(1)，时间复杂度O(N)
 *
 * @author 西邮陈冠希
 * @date 2019/8/21
 **/
public class DutchFlag {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, -8, 7, 9, 2, 3, 2, 22, 6, 4};
        int num = 7;
        int L = 0;
        int R = arr.length - 1;

        arr = partition(arr, num, L, R);
        printArr(arr);
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static int[] partition(int[] arr, int num, int L, int R) {
        int cur = 0;
        int less = L - 1;
        int more = R + 1;

        while (cur < more) {
            if (arr[cur] < num) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > num) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }

        return arr;

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
