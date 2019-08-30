package com.offer.simple;

import java.util.Scanner;

/**
 * @author 西邮陈冠希
 * @date 2019/8/30
 **/
public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String res = strs[0];
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            for (; j < strs[i].length() && j < res.length(); j++) {
                if (res.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
            }
            res = res.substring(0, j);
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strs = {"flower","flow","flight"};
        String s = longestCommonPrefix(strs);
        System.out.println(s);
    }
}
