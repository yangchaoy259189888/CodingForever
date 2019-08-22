package com.offer;

import java.util.*;

public class PartitionLabels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        List<Integer> list = partitionLabels(str);
        list.forEach((i) -> System.out.print(i + " "));
    }

    public static List<Integer> partitionLabels(String S) {
        List<Integer> result = new ArrayList<>();
        char[] c = S.toCharArray();
        Map<Character, Integer> mapStart = new HashMap<>();
        Map<Character, Integer> mapEnd = new HashMap<>();
        for(int i=0;i<c.length;i++){
            if(mapStart.get(c[i])==null){
                mapStart.put(c[i], i);
                mapEnd.put(c[i], i);
            }else{
                mapEnd.put(c[i], i);
            }
        }
        int beginIndex=0;
        while(beginIndex<c.length){
            int endIndex=mapEnd.get(c[beginIndex]);
            for(int i=beginIndex;i<endIndex;i++){
                if(mapEnd.get(c[i])>endIndex){
                    endIndex = mapEnd.get(c[i]);
                }
            }
            result.add(endIndex-beginIndex+1);
            beginIndex = endIndex+1;
        }
        return result;
    }
}
