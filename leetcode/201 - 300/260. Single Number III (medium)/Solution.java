package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] singleNumber(int[] nums) {
		List<Integer> a = new ArrayList<Integer>();
		for(int i=0; i<nums.length; i++){
			if(a.contains(nums[i])){
				a.remove(a.indexOf(nums[i]));
			}else{
				a.add(nums[i]);
			}
		}
		int[] p = new int[a.size()];
		for(int i=0; i<p.length; i++){
			p[i]=a.get(i);
		}
		return p;
    }
}