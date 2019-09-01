package com.written;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        doString(str);
    }

    public static void doString(String input) {
        char[] chars = input.toCharArray();
        ArrayList<String> lists = new ArrayList<String>();
        TreeSet<String> set = new TreeSet<String>();
        for (int i = 0; i < chars.length; i++) {
            lists.add(String.valueOf(chars[i]));
            set.add(String.valueOf(chars[i]));
        }
        Collections.sort(lists);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < lists.size(); i++) {
            sb.append(lists.get(i));
        }
        input = sb.toString();
        int max = 0;
        String maxString = "";
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        Iterator<String> its = set.iterator();
        while (its.hasNext()) {
            String os = its.next();
            int begin = input.indexOf(os);
            int end = input.lastIndexOf(os);
            int value = end - begin + 1;
            if (value >= max) {
                max = value;
                maxString = os;
                hm.put(maxString, max);
            }
        }

        for (Map.Entry<String, Integer> enties : hm.entrySet()) {
            if (enties.getValue() == max) {
                System.out.println(enties.getValue());
            }
        }
    }

}