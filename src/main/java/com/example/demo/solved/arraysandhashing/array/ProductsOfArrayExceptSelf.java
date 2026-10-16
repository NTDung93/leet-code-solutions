package com.example.demo.solved.arraysandhashing.array;

public class ProductsOfArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int[] out = new int[nums.length];

        for (int i = 0; i <= nums.length - 1; i++) {
            if (i == 0) {
                prefix[i] = nums[i];
            } else {
                prefix[i] = prefix[i-1] * nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == nums.length - 1) {
                postfix[i] = nums[nums.length - 1];
            } else {
                postfix[i] = nums[i] * postfix[i+1];
            }
        }

        for (int i = 0; i <= nums.length - 1; i++) {
            if (i == 0) {
                out[i] = postfix[i + 1];
            } else if (i == nums.length - 1) {
                out[i] = prefix[i - 1];
            } else {
                out[i] = prefix[i - 1] * postfix[i + 1];
            }
        }
        return out;
    }
}