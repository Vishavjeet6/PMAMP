package leetcode60;

import java.util.*;

public class TwoSum1 {
	
//	Time O(n), Space O(n)
	
    public static int[] twoSum(int[] nums, int target) {
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<nums.length; i++) {
    		if(map.containsKey(nums[i])) {
    			return new int[] {i,map.get(nums[i])};
    		}else {
    			map.put(target-nums[i], i);
    		}
    	}
    	return new int [] {};
    } 
  
	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int [] {2,7,11,15}, 9)));
	}
}
