package com.example.demo.solved.arraysandhashing.bucketsort;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {
    // Input: nums = [1, 1, 1, 2, 2, 5, 5, 5, 4], k = 3
    //
    // Output: [1, 2, 5]
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num: nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        int[] res = new int[k];
        int idx = 0;
        for (int i = nums.length; i >= 0 && idx < k; i--) {
            if (bucket[i] != null) {
                for (Integer key : bucket[i]) {
                    res[idx++] = key;
                    if (idx == k) break;
                }
            }
        }

        return res;
    }
}