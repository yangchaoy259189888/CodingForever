package com.offer.simple;

/**
 * @author 西邮陈冠希
 * @date 2019/9/11
 **/
public class PlusOne {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int carry = 0;
        for (int i = length - 1; i >= 0; i--) {
            if (i == length - 1 && digits[i] + 1 >= 10) {
                digits[i] = (digits[i] + 1) % 10;
                carry = 1;
            } else if (i == length - 1 && digits[i] + 1 < 10) {
                digits[i] = digits[i] + 1;
                carry = 0;
            } else if (carry == 1 && digits[i] + carry >= 10) {
                digits[i] = (digits[i] + 1) % 10;
                carry = 1;
            } else if (carry == 1 && digits[i] + carry < 10) {
                digits[i] = digits[i] + 1;
                carry = 0;
            } else {
                carry = 0;
            }
        }
        if (carry == 1) {
            int[] ints = new int[length + 1];
            ints[0] = 1;
            for (int i = 1; i < ints.length; i++) {
                ints[i] = digits[i - 1];
            }
            return ints;
        }
        return digits;
    }

    public static void main(String[] args) {
        int[] disits = {8, 9, 9, 9};
        int[] ints = plusOne(disits);
        for (int anInt : ints) {
            System.out.print(anInt + " ");
        }
    }
}
