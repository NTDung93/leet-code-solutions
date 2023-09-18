package solved.hashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfTwoArraysII {
    //hint: create hash map, loop through nums1, if map containsKey(nums1[i]), tăng value của key đó, nếu ch containsKey đó thì put key đó vs val = 1 vào map
//          sau đó, tạo 1 arraylist, loop qua nums2, nếu map chứa key nums2[i] và value của key đó > 0 thì add num2[i] vào arraylist, nhớ trừ value của key đó đi 1, để tránh tìm duplicate
    public static int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0; i<= nums1.length-1; i++){
            if (map.containsKey(nums1[i])){
                map.put(nums1[i], map.get(nums1[i]) + 1);
            }else {
                map.put(nums1[i], 1);
            }
        }

        for (int i=0; i<= nums2.length-1; i++){
            if (map.containsKey(nums2[i]) && map.get(nums2[i]) > 0){
                arr.add(nums2[i]);
                map.put(nums2[i], map.get(nums2[i])-1);
            }
        }

        int[] ans = new int[arr.size()];
        for (int i=0; i<=arr.size()-1; i++){
            ans[i] = arr.get(i);
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] num1 = {4 ,9, 5};
        int[] num2 = {9,4,9,8,4};
        int[] ans = intersect(num1, num2);

        for (int num : ans){
            System.out.print(num + " ");
        }
    }
}
