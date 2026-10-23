package com.example.demo.solved.arraysandhashing.treeset;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LongestConsecutiveSequence {
    // solution 1: use TreeSet -> time: O(n log n)
//    public int longestConsecutive(int[] nums) {
//        Arrays.sort(nums);
//        TreeSet<Integer> out = new TreeSet<Integer>();
//        TreeSet<Integer> tree = new TreeSet<Integer>();
//
//        for (int num : nums) {
//            if (!tree.isEmpty() && tree.contains(num)) {
//                continue;
//            }
//            if (tree.isEmpty() || num - tree.last() == 1) {
//                tree.add(num);
//            }else {
//                out.add(tree.size());
//                tree = new TreeSet<>();
//                tree.add(num);
//            }
//        }
//
//        out.add(tree.size());
//
//        return out.last();
//    }

    // solution 2: use HashSet -> time: O(n)
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }
        int longest = 0;

        for (int num : numSet) {
            if (!numSet.contains(num - 1)) {
                int length = 1;
                while (numSet.contains(num + length)) {
                    length ++;
                }
                longest = Math.max(length, longest);
            }
        }

        return longest;
    }


    public static void main(String[] args) {
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(new int[]{9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}