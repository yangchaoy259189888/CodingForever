package com.niuke.sort;

/**
 * 冒泡排序
 * @author 西邮陈冠希
 * @date 2019/8/8
 **/
public class BubbleSort {
    public static int[] bubbleSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return new int[] {0};
        }

        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
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

        int[] arrays = bubbleSort(arr);
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }
}
