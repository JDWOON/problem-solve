package leetcode;

import java.util.Arrays;

public class Solution {
	public int threeSumClosest(int[] nums, int target) {
		int distance = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			int j = i + 1, k = nums.length - 1;
			while (j < k) {
				int temp = nums[i] + nums[j] + nums[k] - target;

				if (Math.abs(temp) < Math.abs(distance)) {
					distance = temp;
				}

				if (temp < 0) {
					j++;
				} else if (temp > 0) {
					k--;
				} else {
					return target;
				}
			}
		}
		return target + distance;
	}
}