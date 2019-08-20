package com.niuke.sort;

/**
 * 插入排序
 * @author 西邮陈冠希
 * @date 2019/8/9
 **/
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[] {0};
        }

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j--) {
                swap(arr, j, j + 1);
            }
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
//        int temp = arr[i];
//        arr[i] = arr[j];
//        arr[j] = temp;
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 11, 6};

        int[] arrays = insertionSort(arr);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
