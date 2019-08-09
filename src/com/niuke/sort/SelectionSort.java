package com.niuke.sort;

/**
 * @author 西邮陈冠希
 * @date 2019/8/8
 **/
public class SelectionSort {
    public static int[] selectionSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[]{0};
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }

        return arr;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 11, 6};

        int[] arrays = selectionSort(arr);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
