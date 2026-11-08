package com.example.demo.solved.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
//    Input: s = "([{}])"
//    Output: true

//    Input: s = "[(])"
//    Output: false
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) return false;

                if (c == ')' && stack.pop() != '(') {
                    return false;
                } else if (c == ']' && stack.pop() != '[') {
                    return false;
                } else if (c == '}' && stack.pop() != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}