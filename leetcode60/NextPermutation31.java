package leetcode60;

import java.util.Arrays;

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
        		int f=i-1,s=i-1;
        		for(int j=i; j<nums.length; j++) {
        			if(nums[f] < nums[j]) {
        				s=f;
        				f=j;
        				System.out.println("y "+nums[i]+ " " + nums[j] );
        			}else if(nums[s] < nums[j] && nums[f] != nums[j]) {
        				s=j;
        				System.out.println("n "+nums[i]+ " " + nums[j]);
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
		nextPermutation(new int [] {1,3,2});
	}

}
