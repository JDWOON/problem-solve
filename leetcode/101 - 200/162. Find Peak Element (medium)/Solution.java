package leetcode;

public class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length<=0){
            return -1;
        }else if(nums.length==1){
            return 0;
        }else if(nums.length>=2 && nums[0]>nums[1]){
            return 0;
        }else{
            for(int i=1; i<nums.length-1; i++){
                if(nums[i-1]<nums[i] && nums[i]>nums[i+1]){
                    return i;
                }
            }
            return nums.length-1;
        }
    }
}