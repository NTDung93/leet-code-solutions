package com.example.demo.solved.arraysandhashing.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EncodeAndDecodeStrings {
    // encode(["a#b", "12"])  ->  "3#a#b2#12"
    // 3#a#b

    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String str : strs) {
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int len = Integer.parseInt(str.substring(i, j));
            int start = j + 1;
            out.add(str.substring(start, start + len));
            i = start + len;
        }
        return out;
    }

    public static void main(String[] args) {
        EncodeAndDecodeStrings encodeAndDecodeStrings = new EncodeAndDecodeStrings();
        String res = encodeAndDecodeStrings.encode(Arrays.asList("a#b", "12"));
        System.out.println(res);
        System.out.println(encodeAndDecodeStrings.decode(res));
    }
}