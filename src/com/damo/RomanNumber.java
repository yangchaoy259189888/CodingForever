package com.damo;

/**
 * 题目：输入一个十进制数，转换为相应的罗马数字。
 * 例如：I（1）、V（5）、X（10）、L（50）、C（100）、D（500）、M（1000）
 * IV（4）、IX(9)、XL（40）、XC（90）、
 * 请转换0-3999之间的任意数字。
 *
 * @author 西邮陈冠希
 * @date 2019/7/25
 **/
public class RomanNumber {

    private static String covertRomanNum(int num) {
        String[] M = {"", "M", "MM", "MMM"};
        String[] C = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] X = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] I = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        return M[num / 1000] + C[(num % 1000) / 100] + X[(num % 100) / 10] + I[(num % 10)];
    }

    public static void main(String[] args) {
        System.out.println(covertRomanNum(4));
        System.out.println(covertRomanNum(6));
        System.out.println(covertRomanNum(9));
        System.out.println(covertRomanNum(58));
        System.out.println(covertRomanNum(1994));
        System.out.println(covertRomanNum(3999));
    }
}
