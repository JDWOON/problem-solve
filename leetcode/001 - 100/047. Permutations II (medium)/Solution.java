package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		Arrays.sort(nums);
		return permute(nums);
	}

	public List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();

		if (nums.length <= 0) {
			return p;
		} else if (nums.length == 1) {
			List<Integer> temp = new ArrayList<Integer>();
			temp.add(nums[0]);
			p.add(temp);
		} else {
			List<List<Integer>> child = new ArrayList<List<Integer>>();
			int[] cNums = new int[nums.length - 1];

			for (int i = 0; i < nums.length; i++) {
				while (i < nums.length - 1 && nums[i] == nums[i + 1]) {
					i++;
				}

				int idx = 0;

				for (int j = 0; j < nums.length; j++) {
					if (i != j) {
						cNums[idx] = nums[j];
						idx++;
					}
				}

				child = permute(cNums);

				for (int j = 0; j < child.size(); j++) {
					child.get(j).add(0, nums[i]);
					p.add(child.get(j));
				}
			}
		}
		return p;
	}
}