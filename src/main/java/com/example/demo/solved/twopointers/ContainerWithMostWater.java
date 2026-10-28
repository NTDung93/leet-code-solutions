package com.example.demo.solved.twopointers;

public class ContainerWithMostWater {
    public int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1, max = 0;

        while (left < right) {
            max = Math.max(max, (right - left) * Math.min(heights[left], heights[right]));

            if (heights[left] < heights[right]) {
                left ++;
            } else {
                right --;
            }
        }

        return max;
    }
}