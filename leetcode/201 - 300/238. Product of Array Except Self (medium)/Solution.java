package leetcode;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int k=1;
        for(int i=0; i<nums.length; i++){
            output[i]=k;
            k*=nums[i];
        }
        k=1;
        for(int i=nums.length-1; i>-1; i--){
            output[i]*=k;
            k*=nums[i];
        }
        return output;
    }
}