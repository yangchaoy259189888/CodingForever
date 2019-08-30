package com.offer.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 西邮陈冠希
 * @date 2019/8/28
 **/
public class RomanToInteger {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("IV", 4);
        map.put("V", 5);
        map.put("IX", 9);
        map.put("X", 10);
        map.put("XL", 40);
        map.put("L", 50);
        map.put("XC", 90);
        map.put("C", 100);
        map.put("CD", 400);
        map.put("D", 500);
        map.put("CM", 900);
        map.put("M", 1000);

        int res = 0;
        int i = 0;
        while (i < s.length()) {
            if (i + 1 < s.length() && map.containsKey(s.substring(i, i + 2))) {
                res = res + map.get(s.substring(i, i + 2));
                i += 2;
            } else if (map.containsKey(s.substring(i, i + 1))){
                res = res + map.get(s.substring(i, i + 1));
                i += 1;
            } else {
                return 0;
            }
        }

        return res;
    }
}
