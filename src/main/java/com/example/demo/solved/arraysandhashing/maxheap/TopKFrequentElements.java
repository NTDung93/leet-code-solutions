package com.example.demo.solved.arraysandhashing.maxheap;

import java.util.HashMap;
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

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (a, b) -> freqMap.get(b) - freqMap.get(a)
        );
        queue.addAll(freqMap.keySet());

        int[] res = new int[k];
        for (int i = 0; i <= k - 1; i++) {
            res[i] = queue.poll();
        }

        return res;
    }
}