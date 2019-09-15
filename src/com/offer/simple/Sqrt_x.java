package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/15
 **/
public class Sqrt_x {
    public static int mySqrt1(int x) {
        return (int) Math.sqrt(x);
    }

    public static int mySqrt2(int x) {
        double mid = x / 2;
        double L = 0;
        double R = x;

        while ((int) L < (int) R) {
            if (mid * mid > x) {
                R = mid;
                mid = (L + R) / 2;
            } else {
                L = mid;
                mid = (L + R) / 2;
            }
        }

        return (int) mid;
    }

    public static void main(String[] args) {
        int x = 8;
        int i = mySqrt2(x);
        System.out.println(i);
    }
}
