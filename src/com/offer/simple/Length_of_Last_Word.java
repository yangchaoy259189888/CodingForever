package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/11
 **/
public class Length_of_Last_Word {
    public static int lengthOfLastWord(String s) {
        if (null == s) {
            return 0;
        }
        String[] strings = s.split("\\s+");
        int length = strings.length;
        if (length == 0) {
            return 0;
        }
        return strings[length - 1].length();
    }

    public static void main(String[] args) {
        String str = "Hello";
        int i = lengthOfLastWord(str);
        System.out.println(i);
    }
}
