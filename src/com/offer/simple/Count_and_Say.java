package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/10
 **/
public class Count_and_Say {
    public static String countAndSay(int n) {
        String str = "1";
        for (int i = 1; i < n; i++) {
            int count = 1;
            char num = str.charAt(0);
            StringBuilder sb = new StringBuilder();
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == num) {
                    count++;
                } else {
                    sb.append(count).append(num);
                    count = 1;
                    num = str.charAt(j);
                }
            }

            sb.append(count).append(num);
            str = sb.toString();
        }
        return str;
    }

    public static void main(String[] args) {
        String s = countAndSay(5);
        System.out.println(s);
    }
}
