package com.example.demo.solved.twoPointers;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        System.out.println(isPalindrome(num));
    }


    private static boolean isPalindrome(int num){
        String number = String.valueOf(num);
        int left = 0;
        int right = number.length()-1;

        while (left < right){
            if (number.charAt(left) != number.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    private static boolean isPalindrome2(int num) {
        if (num < 0)
            return false;

        int rev = 0;

        int save = num;

        do {
            int div = num % 10;
            rev = rev * 10 + div;
            num = num / 10;
        }while (num>=1);

        if (rev == save){
            return  true;
        }

        return false;
    }
}
