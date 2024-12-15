package p1_twosum;

import java.util.Arrays;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] data = new int[nums.length];
        System.arraycopy (nums, 0, data, 0, nums.length);
        Arrays.sort(nums);
        
        int i=0, j = nums.length-1;
        int[] p = new int[2];
        while(nums[i]+nums[j]!=target){
            if(nums[i]+nums[j]<target){
                i++;
            }else if(nums[i]+nums[j]>target){
                j--;
            }
        }
        
        boolean check = false;
        for(int n=0; n<data.length; n++){
            if(nums[i] == data[n] && !check){
                p[0]=n;
                check = true;
            }else if(nums[j] == data[n]){
                p[1]=n;
            }
        }
        return p;
    }
}
