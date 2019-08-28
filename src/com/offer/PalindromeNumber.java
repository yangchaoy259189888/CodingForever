package com.offer;

/**
 * @author 西邮陈冠希
 * @date 2019/8/28
 **/
public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int temp = x;
        int res = 0;
        while (x != 0) {
            res = res * 10 + x % 10;
            x /= 10;
        }

        if (res == temp) {
            return true;
        } else {
            return false;
        }
    }
}
