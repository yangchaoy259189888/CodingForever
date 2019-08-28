package com.offer;

/**
 * java int 类整数的最大值是 2 的 31 次方 - 1 = 2147483648 - 1 = 2147483647
 *
 * 可以用 Integer.MAX_VALUE 表示它，即 int value = Integer.MAX_VALUE;
 *
 *  
 *
 * Integer.MAX_VALUE + 1 = Integer.MIN_VALUE = -2147483648
 */
public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int pop = x % 10;
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > 7))
                return 0;
            if (res < Integer.MIN_VALUE / 10 || (res == Integer.MIN_VALUE / 10 && pop < -8))
                return 0;


            res = res * 10 + pop;
            x /= 10;
        }
        return res;
    }
}