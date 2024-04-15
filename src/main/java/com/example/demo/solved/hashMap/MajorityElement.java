package com.example.demo.solved.hashMap;

import java.util.HashMap;

public class MajorityElement {
//    hint: create hash map with(nums[i], freq of nums[i]), loop through nums[], if map containsKey(num[i]), then put (nums[i], freq++).
//          if freq of nums[i] > nums.length / 2 then return nums[i]
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i< nums.length; i++){
            if (map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i]) + 1);
            }else {
                map.put(nums[i], 1);
            }

            if (map.get(nums[i]) > nums.length / 2){
                return nums[i];
            }
        }

        return Integer.parseInt(null);
    }
}
