package com.offer;

/**
 * 小和问题
 * @author 西邮陈冠希
 * @date 2019/8/20
 **/
public class SmallSum {

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 5};
        int sum;

        sum = smallSum(arr);
        System.out.println("sum: " + sum);
    }

    private static int smallSum(int[] arr) {
        if (arr == null || arr.length < 2) {
            return 0;
        }

        return smallSum_mergeSort(arr, 0, arr.length - 1);
    }

    private static int smallSum_mergeSort(int[] arr, int L, int R) {
        if (L == R) {
            return 0;
        }

        int mid = L + ((R - L) >> 1);
        return smallSum_mergeSort(arr, L, mid) + smallSum_mergeSort(arr, mid + 1, R) + smallSum_merge(arr, L, mid, R);
    }

    private static int smallSum_merge(int[] arr, int L, int mid, int R) {
        int[] temp = new int[R - L + 1];
        int i = 0;
        int p1 = L;
        int p2 = mid + 1;
        int res = 0;

        while (p1 <= mid && p2 <= R) {
            res += arr[p1] < arr[p2] ? arr[p1] * (R - p2 + 1) : 0;
            temp[i++] = arr[p1] < arr[p2] ? arr[p1++] : arr[p2++];
        }

        while (p1 <= mid) {
            temp[i++] = arr[p1++];
        }
        while (p2 <= R) {
            temp[i++] = arr[p2++];
        }

        for (int j = 0; j < temp.length; j++) {
            arr[L + j] = temp[j];
        }

        return res;
    }
}
