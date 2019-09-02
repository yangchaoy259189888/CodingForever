package com.offer.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * 给一个从小到大顺序的字符串，删除字符串里的重复字符，
 * 每个字符最多允许出现两次，返回字符串新的长度例子，
 * 输入：1222333输出：字符串变成12233，新的长度是5
 *
 * @author 西邮陈冠希
 * @date 2019/9/2
 **/
public class StrDelduplication {
    public static int strDeduplication(String str){
        if (str.length() <= 0 || str.length() >= 100) {
            return 0;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == null) {
                map.put(str.charAt(i), 1);
            } else {
                map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
            }
        }

        int count = 0;
        for (Integer value : map.values()) {
            if (value >= 2) {
                count = count + 2;
            } else {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        if(in.hasNext()){
            String str = in.next();
            System.out.println(strDeduplication(str));
        }
    }
}
