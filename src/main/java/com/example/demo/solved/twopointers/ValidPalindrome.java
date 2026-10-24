package com.example.demo.solved.twopointers;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
//        Input: s = "Was it a car or a cat I saw?"
//        Output: true

        String palin = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr = palin.toCharArray();
        int left = 0, right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }
}