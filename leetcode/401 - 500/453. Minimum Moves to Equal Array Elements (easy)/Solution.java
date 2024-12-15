package leetcode;

public class Solution {
    public int minMoves(int[] nums) {
    	int min = Integer.MAX_VALUE;
    	int p = 0;
    	
    	for(int i=0; i<nums.length; i++){
    		if (nums[i] < min){
    			min = nums[i];
    		}
    	}
    	
    	for(int i=0; i<nums.length; i++){
    		p += nums[i] - min;
    	}
    	
    	return p;
    }
}