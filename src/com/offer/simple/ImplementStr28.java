package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/3
 **/
public class ImplementStr28 {
    public static int strStr(String haystack, String needle) {
        if (needle.equals("")) {
            return 0;
        }
        if (!haystack.contains(needle)) {
            return -1;
        }

        int i = haystack.indexOf(needle);

        return i;
    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        int i = strStr(haystack, needle);
        System.out.println(i);
    }
}
