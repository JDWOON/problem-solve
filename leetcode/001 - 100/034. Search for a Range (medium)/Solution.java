package leetcode;

import java.util.Arrays;

public class Solution {
	public int[] searchRange(int[] nums, int target) {
		int[] p = new int[2];

		p[0] = Arrays.binarySearch(nums, target);
		p[1] = p[0];

		if (p[0] < 0) {
			p[0] = -1;
			p[1] = -1;
			return p;
		}

		while (p[0] > 0 && nums[p[0] - 1] == target) {
			p[0]--;
		}
		while (p[1] < nums.length - 1 && nums[p[1] + 1] == target) {
			p[1]++;
		}

		return p;
	}
}