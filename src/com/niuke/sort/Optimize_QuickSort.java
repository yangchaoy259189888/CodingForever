package com.niuke.sort;

/**
 * 随机快排
 * O（N*logN）
 *
 * 空间复杂度：O（logN）
 *
 * @author 西邮陈冠希
 * @date 2019/8/21
 **/
public class Optimize_QuickSort {
    public static void main(String[] args) {
        int[] arr = {7, 1, 3, 4, -8, 7, 9, 2, 3, 2, 22, 6, 4};
        int L = 0;
        int R = arr.length - 1;

        quickSort(arr, L, R);
        printArr(arr);
    }

    private static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            //随机产生一个数组中的元素，与R对应元素交换位置，造成一个概率事件，有可能参考基数是中间值
            swap(arr, (int) (L + Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }

    private static int[] partition(int[] arr, int L, int R) {
        int cur = L;
        int less = L - 1;
        int more = R;

        while (cur < more) {
            if (arr[cur] < arr[R]) {
                swap(arr, ++less, cur++);
            } else if (arr[cur] > arr[R]) {
                swap(arr, --more, cur);
            } else {
                cur++;
            }
        }
        swap(arr, cur, R);
        return new int[] {less + 1, more};

    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
