package com.damo;

/**
 * 反转数字，如123 -> 321，-123 -> -321，120 -> 21。
 * 如果反转的结果超过int的表示范围，则返回0。
 *
 * @author 西邮陈冠希
 * @date 2019/7/26
 **/
public class ReverseInt {
    private static int reverse(int num) {
        long result = 0;
        for (; num != 0; num /= 10) {
            result = result * 10 + num % 10;
        }

        return result < Integer.MIN_VALUE || result > Integer.MAX_VALUE ? 0 : (int) result;
    }

    /**
     * 1234321
     * num      result
     * 1234321  0
     * 123432   1
     * 12343    12
     * 1234     123
     * 123      1234
     *
     * @param num
     * @return
     */
    private static boolean reverse2(int num) {
        long result = 0;
        while (num > result) {
            result = result * 10 + num % 10;
            num /= 10;
        }

        return result == num || result / 10 == num;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(321));
        System.out.println(reverse(125324));
        System.out.println(reverse(-23548));
        System.out.println(reverse(0));
        System.out.println(reverse(1200));

        System.out.println("--------------------------");
        System.out.println(reverse2(1200));
        System.out.println(reverse2(121));
        System.out.println(reverse2(1234321));
        System.out.println(reverse2(12344321));

    }
}
