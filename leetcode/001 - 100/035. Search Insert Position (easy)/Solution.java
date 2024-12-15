package leetcode;

public class Solution {
	public int searchInsert(int[] nums, int target) {
		int low = 0, high = nums.length-1, mid=0;
		while(high-low>1){
			mid = (high + low)/2;
			if(nums[mid]==target){
				return mid;
			}else if(nums[mid]<target){
				low = mid;
			}else if(nums[mid]>target){
				high = mid;
			}
		}
		if(nums[high]<target){
			return high+1;
		}else if(nums[low]<target){
			return high;
		}else{
			return low;
		}
	}
}