package leetcode;

public class Solution {
	public int rob(int[] nums) {
		int a = 0, b = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i % 2 == 0) {
				a += nums[i];
				if (b > a) {
					a = b;
				}
			} else {
				b += nums[i];
				if (a > b) {
					b = a;
				}
			}
		}

		return Math.max(a, b);
	}
}