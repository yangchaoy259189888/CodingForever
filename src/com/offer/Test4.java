package com.offer;

/**
 * @Author: 杨朝阳
 * @Version: V1.0
 * @Date: 2019/2/12 21:23
 * @Description: 二维数组中的查找
 **/
public class Test4 {
    public boolean find(int[] matrix, int rows, int columns, int number) {
        boolean found = false;

        if (matrix != null && rows > 0 && columns > 0) {
            int row = 0;
            int column = columns - 1;
            while (row < rows && column >= 0) {
                if (matrix[row * columns + column] == number) {
                    found = true;
                    break;
                } else if (matrix[row * columns + column] > number) {
                    --column;
                } else {
                    ++row;
                }
            }
        }

        return found;
    }

    public static void main(String[] args) {
//        int[] matrix = {1,2,8,9,2,4,9,12,4,7,10,13,6,8,11,5};
//        int rows = 4;
//        int columns = 4;
//        int number = 3;
//
//        boolean found = new Test4().find(matrix, rows, columns, number);
//        System.out.println(found);

        int[][] matrix = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,5}};
        System.out.println(matrix[0][3]);
    }
}
