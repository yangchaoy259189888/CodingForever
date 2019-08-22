package com.offer;

import java.util.*;

/**
 * https://blog.csdn.net/chaochen1407/article/details/81602871
 *
 */

public class AlienDictionary {
    public static String alienOrder(String[] words) {
        HashMap<Character, HashSet<Character>> graph = new HashMap<>();
        HashMap<Character, Integer> degree = new HashMap<>();
        buildGraph(graph, degree, words);

        return topoSortBFS(graph, degree);
    }

    public static String topoSortBFS(HashMap<Character, HashSet<Character>> graph, HashMap<Character, Integer> degree) {
        Queue<Character> queue = new LinkedList<Character>();
        StringBuilder sb = new StringBuilder();
        for (char ch : degree.keySet()) {
            if (degree.get(ch) == 0) queue.add(ch);
        }

        while (!queue.isEmpty()) {
            char curCh = queue.poll();
            sb.append(curCh);
            degree.remove(curCh);
            HashSet<Character> nextChs = graph.get(curCh);
            if (nextChs != null) {
                for (char nextCh : nextChs) {
                    int nextDegree = degree.get(nextCh) - 1;
                    if (nextDegree == 0) {
                        queue.add(nextCh);
                    }
                    degree.put(nextCh, nextDegree);
                }
            }
        }

        return degree.isEmpty() ? sb.toString() : "invalid";
    }

    public static void buildGraph(HashMap<Character, HashSet<Character>> graph, HashMap<Character, Integer> degree, String[] words) {
        for (int i = 0; i < words.length; i++) {
            char[] chArr = words[i].toCharArray();
            for (char ch : chArr) degree.putIfAbsent(ch, 0);

            if (i > 0) {
                char[] prevChArr = words[i - 1].toCharArray();
                int len = Math.min(prevChArr.length, chArr.length);
                for (int j = 0; j < len; j++) {
                    if (prevChArr[j] != chArr[j]) {
                        if (!graph.containsKey(prevChArr[j])) graph.put(prevChArr[j], new HashSet<>());

                        if (!graph.get(prevChArr[j]).contains(chArr[j])) {
                            graph.get(prevChArr[j]).add(chArr[j]);
                            degree.put(chArr[j], degree.get(chArr[j]) + 1);
                        }
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        String s = alienOrder(words);
        System.out.println(s);
    }
}
