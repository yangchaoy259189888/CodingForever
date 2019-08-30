package com.offer.simple;

import java.util.Stack;

/**
 *给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 **/
public class ValidParentheses {
    public static boolean isValid(String s) {
        if (s == null) {
            return false;
        }
        if (s.equals("")) {
            return true;
        }
        Stack stack = new Stack();
        for (char c : s.toCharArray()) {
            if (stack.isEmpty() && (c == ')' || c == ']' || c == '}')) {
                return false;
            }
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && !stack.pop().equals('(')) {
                return false;
            } else if (c == ']' && !stack.isEmpty() && !stack.pop().equals('[')) {
                return false;
            } else if (c == '}' && !stack.isEmpty() && !stack.pop().equals('{')) {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String s = "}";
        boolean valid = isValid(s);
        System.out.println(valid);
    }
}
