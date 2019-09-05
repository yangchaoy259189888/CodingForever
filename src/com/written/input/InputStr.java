package com.written.input;

import java.util.Scanner;

/**
 * @author 西邮陈冠希
 * @date 2019/8/19
 **/
public class InputStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();
        String[] s = str.split("\\s+");
        for (int i = 0; i < s.length; i++) {
            int parseInt = Integer.parseInt(s[i]);
            System.out.println(parseInt);
        }
    }
}
