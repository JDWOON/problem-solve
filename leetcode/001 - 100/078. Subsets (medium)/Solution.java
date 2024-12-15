package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		p.add(new ArrayList<Integer>());
		for (int i = 0; i < nums.length; i++) {
			int len = p.size();
			for (int j = 0; j < len; j++) {
				List<Integer> temp = new ArrayList<Integer>(p.get(j));
				temp.add(nums[i]);
				p.add(temp);
			}
		}
		return p;
	}
}