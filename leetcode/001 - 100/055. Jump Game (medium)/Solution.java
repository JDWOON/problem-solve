package leetcode;

public class Solution {
	public boolean canJump(int[] nums) {
		if (nums.length < 2) {
			return true;
		}

		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == 0) {
				int j;
				for (j = i - 1; j >= 0; j--) {
					if (nums[j] > i - j) {
						break;
					}
				}
				if (j == -1) {
					return false;
				}
			}
		}

		return true;
	}
}