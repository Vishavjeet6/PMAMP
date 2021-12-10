package leetcode60;

public class SearchinRotatedSortedArray33 {
	
    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        int mid = (start+end)/2;
        
        while(start < end){
            if(nums[mid] == target){
                return mid;
            }else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<nums[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            mid = (start+end)/2;
        }
        return nums[start] == target ? start : -1;
    }
	
	public static void main(String[] args) {
		System.out.println(search(new int [] {4,5,6,1,2,3},2));
	}
}
