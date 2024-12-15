package leetcode;

public class Solution {
	public void nextPermutation(int[] nums) {
		int k = nums.length - 1;
		while (k > 0) {
			if (nums[k] > nums[k - 1]) {
				break;
			}
			k--;
		}
		if (k == 0) {
			for (int i = 0; i < nums.length / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[nums.length - 1 - i];
				nums[nums.length - 1 - i] = temp;
			}
		} else {
			k--;
			for (int i = nums.length - 1; i > k; i--) {
				if (nums[k] < nums[i]) {
					int temp = nums[k];
					nums[k] = nums[i];
					nums[i] = temp;
					break;
				}
			}
			for (int i = k + 1; i < (nums.length + k + 1) / 2; i++) {
				int temp = nums[i];
				nums[i] = nums[nums.length + k - i];
				nums[nums.length + k - i] = temp;
			}
		}
	}
}