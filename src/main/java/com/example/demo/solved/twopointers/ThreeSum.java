package com.example.demo.solved.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;   // fix 4

            int target = -nums[i];
            int left = i + 1, right = nums.length - 1;       // fix 1

            while (left < right) {
                int sum = nums[left] + nums[right];
                if (sum == target) {
                    out.add(List.of(nums[i], nums[left], nums[right]));
                    while (left < right && nums[left] == nums[left + 1]) left++;     // fix 2, 3
                    while (left < right && nums[right] == nums[right - 1]) right--;  // fix 2, 3
                    left++;
                    right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return out;
    }

    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        // -4, -1, -1, 0, 1, 2
        for (List<Integer> list : threeSum.threeSum(new int[]{-1,0,1,2,-1,-4})) {
            System.out.println(list);
        }
    }
}