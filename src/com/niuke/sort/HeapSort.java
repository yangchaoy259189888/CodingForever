package com.niuke.sort;

/**
 * 堆排序的细节和复杂度分析
 * 时间复杂度O(N*logN)，额外空间复杂度O(1)
 * 堆结构非常重要
 * 1，堆结构的heapInsert与heapify
 * 2，堆结构的增大和减少
 * 3，如果只是建立堆的过程，时间复杂度为O(N)
 * 4，优先级队列结构，就是堆结构
 *
 * @author 西邮陈冠希
 * @date 2019/8/22
 **/
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = {2, 1, 9, 4, 7, 11, 6};

        heapSort(arr);
        printArr(arr);
    }

    private static void heapSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i);
        }
        int heapSize = arr.length;
        swap(arr, 0, --heapSize);
        while (heapSize > 0) {
            heapify(arr, 0, heapSize);
            swap(arr, 0, --heapSize);
        }
    }

    private static void heapInsert(int[] arr, int index) {
        while (arr[index] > arr[(index - 1) / 2]) {
            swap(arr, index, (index - 1) / 2);
            index = (index - 1) / 2;
        }
    }

    /**
     * 如果元素变了，堆的结构要进行调整
     * @param arr
     * @param index
     * @param heapSize 堆的大小
     */
    private static void heapify(int[] arr, int index, int heapSize) {
        int left = index * 2 + 1;
        while (left < heapSize) {
            //左右孩子中找到最大的节点
            int largest = left + 1 < heapSize && arr[left] < arr[left + 1] ? left + 1 : left;
            //孩子节点中最大的和父节点比，看哪个大，如果父节点大，则不变，否则交换.
            largest = arr[largest] > arr[index] ? largest : index;
            if (largest == index) { //如果孩子节点小，largest是index，不用交换
                break;
            }
            swap(arr, largest, index);
            index = largest;
            left = index * 2 + 1;
        }
    }


    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArr(int[] arrays) {
        for (int array : arrays) {
            System.out.print(array + " ");
        }
    }

}
