package leetcode;

public class Solution {
	public int maxSubArray(int[] nums) {
		int p = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];

			if (min > nums[i]) {
				min = nums[i];
			}

			if (p < sum) {
				p = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}
		return p;
	}
}