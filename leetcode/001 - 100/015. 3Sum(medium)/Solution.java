package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1, k = nums.length - 1;
			while(j<k){
				int sum = nums[i]+nums[j]+nums[k];
				if(sum>0){
					k--;
				}else if(sum<0){
					j++;
				}else{
					List<Integer> temp = new ArrayList<Integer>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					p.add(temp);
					while(j<k && nums[j]==nums[j+1]){
						j++;
					}
					j++;
				}
			}
			while(i<nums.length-2 && nums[i]==nums[i+1]){
				i++;
			}
		}

		return p;
    }
}