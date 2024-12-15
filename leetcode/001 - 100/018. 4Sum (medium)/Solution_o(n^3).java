package leetcode;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		for (int a = 0; a < nums.length - 3 && nums[a] * 4 <= target; a++) {
			for (int b = a + 1; b < nums.length - 2; b++) {
				int c = b + 1;
				int d = nums.length - 1;
				while (c < d) {
					int sum = nums[a] + nums[b] + nums[c] + nums[d];
					List<Integer> temp = new ArrayList<Integer>();
					if (sum == target) {
						temp.add(nums[a]);
						temp.add(nums[b]);
						temp.add(nums[c]);
						temp.add(nums[d]);
						if (!p.contains(temp)) {
							p.add(temp);
						}
						c++;
						while (c < nums.length - 2 && nums[c] == nums[c - 1]) {
							c++;
						}
					} else if (sum < target) {
						c++;
						while (c < nums.length - 2 && nums[c] == nums[c - 1]) {
							c++;
						}
					} else {
						d--;
						while (d > 4 && nums[d] == nums[d + 1]) {
							d--;
						}
					}
				}
				while (b < nums.length - 3 && nums[b] == nums[b + 1]) {
					b++;
				}
			}
			while (a < nums.length - 4 && nums[a] == nums[a + 1]) {
				a++;
			}
		}
		return p;
	}
}