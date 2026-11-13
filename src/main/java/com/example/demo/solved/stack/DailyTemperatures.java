package com.example.demo.solved.stack;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
//    Input: temperatures = [30,38,30,36,35,40,28]
//    Output: [1,4,1,2,1,0,0]

    public int[] dailyTemperatures(int[] temperatures) {
        int[] out = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < temperatures.length; i++) {
            int tempCurDay = temperatures[i];
            while (!stack.isEmpty() && tempCurDay > temperatures[stack.peek()]) {
                int thatDay = stack.peek();
                out[thatDay] = i - stack.pop();
            }
            stack.push(i);
        }

        return out;
    }

//    public int[] dailyTemperatures(int[] temperatures) {
//        int[] out = new int[temperatures.length];
//        for (int i = 0; i < temperatures.length; i++) {
//            int day = 0;
//            boolean exist = false;
//
//            for (int j = i + 1; j < temperatures.length; j++) {
//                if (temperatures[i] >= temperatures[j]) {
//                    day++;
//                } else {
//                    exist = true;
//                    day++;
//                    break;
//                }
//            }
//
//            if (!exist) {
//                out[i] = 0;
//                continue;
//            }
//
//            out[i] = day;
//        }
//        return out;
//    }

    public static void main(String[] args) {
        DailyTemperatures dailyTemperatures = new DailyTemperatures();
        System.out.println(Arrays.toString(dailyTemperatures.dailyTemperatures(new int[]{30, 38, 30, 36, 35, 40, 28})));
    }
}