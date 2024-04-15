package com.example.demo.solved.hashMap;

import java.util.Arrays;
import java.util.HashMap;

public class ContainsDuplicate {
    //hint1: sort the nums[], loop through it, if nums[i] == nums[i+1] return true
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i<nums.length-1; i++){
            if (nums[i] == nums[i+1]) return true;
        }
        return  false;
    }

    //hint2: loop and put all nums[i] to map, if map containsKey(nums[i]) then return true
    public static boolean containsDuplicateSS(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i],1);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(containsDuplicateSS(arr));
    }
}
