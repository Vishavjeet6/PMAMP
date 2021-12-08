package leetcode60;

import java.util.Arrays;
import java.util.Collections;

public class NextPermutation31 {
	
    public static void nextPermutation(int[] nums) {
        if(nums.length <= 1) {
        	System.out.println(Arrays.toString(nums));
        	return;
        }
        for(int i=nums.length-1; i>0; i--) {
        	if(nums[i]<=nums[i-1]) {
        		continue;
        	}else {
        		int f=i,s=i;
        		for(int j=i+1; j<nums.length; j++) {
        			if(nums[f] < nums[j]) {
        				s=f;
        				f=j;
        			}else if(nums[s] < nums[j] && nums[f] != nums[j]) {
        				s=j;
        			}
        		}
        		System.out.println(nums[s] + " " + nums[i]);
        		int temp = nums[s];
        		nums[s] = nums[i];
        		nums[i] = temp;
        		System.out.println(Arrays.toString(nums));
        		return;
        	}
        }
        		for(int j=0; j<nums.length/2; j++) {
        			int temp = nums[j];
        			nums[j] = nums[nums.length - j - 1];
        			nums[nums.length - j - 1] = temp;
        		}
        		
        		System.out.println(Arrays.toString(nums));
        		return;
        	
    }
	
	public static void main(String[] args) {
		nextPermutation(new int [] {1,2,3});
	}

}
