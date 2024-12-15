package leetcode;

import java.util.Arrays;

public class Solution {
    public int missingNumber(int[] nums) {
        boolean[] a = new boolean[nums.length+1];
        Arrays.fill(a, false);
        for(int i=0; i<nums.length; i++){
            a[nums[i]] = true;
        }
        for(int i=0; i<nums.length+1; i++){
            if(a[i] == false){
                return i;
            }
        }
        return 0;
    }
}