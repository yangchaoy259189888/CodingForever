package com.written.input;

import java.util.Scanner;

/**
 * @author 西邮陈冠希
 * @date 2019/8/19
 **/
public class InputArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
    }
}
