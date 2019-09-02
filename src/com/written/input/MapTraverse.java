package com.written.input;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author 西邮陈冠希
 * @date 2019/9/3
 **/
public class MapTraverse {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        //entry
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }

        //keySet
        for (Integer integer : map.keySet()) {
            System.out.println(integer + ":" + map.get(integer));
        }

        //values
        for (String value : map.values()) {
            System.out.println(value);
        }

        //iterator
        Iterator<Map.Entry<Integer, String>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + ":" + value);
        }
    }
}
