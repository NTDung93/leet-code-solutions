package com.example.demo.solved.stack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class EvaluateReversePolishNotation {
//    Input: tokens = ["1","2","+","3","*","4","-"]
//    Output: 5
//    Explanation: ((1 + 2) * 3) - 4 = 5

    public int evalRPN(String[] tokens) {
       Stack<Integer> stack = new Stack<>();
       List<String> symbols = new ArrayList<>(Arrays.asList("+", "-", "*", "/"));
       for (String token : tokens) {
           if (symbols.contains(token)) {
               Integer second = stack.pop();
               Integer first = stack.pop();
               switch (token) {
                   case "+":
                       stack.push(first + second);
                       break;
                   case "-":
                       stack.push(first - second);
                       break;
                   case "*":
                       stack.push(first * second);
                       break;
                   case "/":
                       stack.push(first / second);
                       break;
               }
           } else {
               stack.push(Integer.parseInt(token));
           }
       }
       return stack.peek();
    }
}