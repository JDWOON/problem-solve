package leetcode;

public class Solution {
	public int firstMissingPositive(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			while (nums[i] != i + 1 && nums[i] <= nums.length && nums[i] > 0) {
				int j = nums[i];

				if (nums[j - 1] == nums[i]) {
					break;
				}

				nums[i] = nums[j - 1];
				nums[j - 1] = j;
			}
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != i + 1) {
				return i + 1;
			}
		}

		return nums.length + 1;
	}
}