package com.written.input;

import java.util.Scanner;

/**
 * @author 西邮陈冠希
 * @date 2019/9/2
 **/
public class InputRowCol {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numRow = in.nextInt();
        int[][] numArrs = new int[numRow][];
        int numCols = in.nextInt();
        for(int i = 0; i < numRow; i++){
            numArrs[i] = new int[numCols];
            for(int j = 0; j < numCols; j++){
                numArrs[i][j] = in.nextInt();
            }
        }
    }
}
