package task01;

import java.util.*;

public class task01_01 {
	public int[] twoSum(int[] nums, int target) {
        if(nums.length == 0){
        	throw new IllegalArgumentException("No two sum solution");
        }
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement) && map.get(complement) != i) {
                return new int[] { i, map.get(complement) };
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
