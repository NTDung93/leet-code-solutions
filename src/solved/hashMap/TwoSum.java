package solved.hashMap;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
//    hint: create a hash map, loop through given solved.array, cal the sub by target - nums[i]
//         if the map containsKey(sub), assign index of 2 elements, else put the (nums[i], i) to map

    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i=0; i<= nums.length-1; i++){
            int sub = target - nums[i];
            if (map.containsKey(sub)){
                ans[0] = i;
                ans[1] = map.get(sub);
            }else{
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}
