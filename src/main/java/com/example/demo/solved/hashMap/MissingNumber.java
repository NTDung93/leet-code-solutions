package com.example.demo.solved.hashMap;

import java.util.HashMap;

public class MissingNumber {
    //hint: loop through the nums[], put all to map, then loop from 0 to n, if ! map containsKey(i) then return i
    public int missingNumber(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<=nums.length-1; i++){
            map.put(nums[i], 1);
        }

        for (int i=0; i<= n; i++){
            if (!map.containsKey(i)){
                return i;
            }
        }

        return Integer.parseInt(null);
    }
}
