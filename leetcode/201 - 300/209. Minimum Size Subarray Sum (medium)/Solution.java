package leetcode;

public class Solution {
	public int minSubArrayLen(int s, int[] nums) {
		int a = 0, b = 0, sum = 0, result = Integer.MAX_VALUE;
		boolean isExist = false;

		for (int i = 0; i < nums.length; i++) {
			b = i;
			sum += nums[i];

			while (sum >= s) {
				if (b - a + 1 < result) {
					result = b - a + 1;
					isExist = true;
				}
				sum -= nums[a];
				a++;
			}
		}

		return isExist ? result : 0;
	}
}