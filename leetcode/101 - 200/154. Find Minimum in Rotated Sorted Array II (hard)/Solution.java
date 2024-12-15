package leetcode;

public class Solution {
    public int findMin(int[] nums) {
        int p = nums[0];
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]>nums[i+1]){
                p=nums[i+1];
            }
        }
        return p;
    }
}