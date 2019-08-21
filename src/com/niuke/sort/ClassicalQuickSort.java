package com.niuke.sort;

/**
 * 经典快排算法思想：挖坑埋坑 + 分治
 * @author 西邮陈冠希
 * @date 2019/8/21
 **/
public class ClassicalQuickSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 11, 6};
        int L = 0;
        int R = arr.length - 1;

        quickSort(arr, L, R);
        printArr(arr);
    }

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

    private static void printArr(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
