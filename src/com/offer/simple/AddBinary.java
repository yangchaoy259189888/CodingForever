package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/12
 **/
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int i1 = i >= 0 ? a.charAt(i) - '0' : 0;
            int i2 = j >= 0 ? b.charAt(j) - '0' : 0;
            if (i1 + i2 + carry >= 2) {
                sum.append((i1 + i2 + carry) % 2);
                carry = 1;
            } else {
                sum.append(i1 + i2 + carry);
                carry = 0;
            }
        }

        if (carry == 1) {
            sum.append(1);
        }

        return String.valueOf(sum.reverse());
    }

    public static void main(String[] args) {
        String a = "1111";
        String b = "1111";

        String s = addBinary(a, b);
        System.out.println(s);
    }
}
