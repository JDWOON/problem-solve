package leetcode;

public class Solution {
    public void rotate(int[] nums, int k) {
		if (nums.length <= 1) {
			return;
		}
		
		k=k%nums.length;

		for (int i = 0; i < (nums.length - k) / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - k - i - 1];
			nums[nums.length - k - i - 1] = temp;
		}

		for (int i = nums.length - k; i < nums.length - k / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[2 * nums.length - i - k - 1];
			nums[2 * nums.length - i - k - 1] = temp;
		}

		for (int i = 0; i < nums.length / 2; i++) {
			int temp = nums[i];
			nums[i] = nums[nums.length - i - 1];
			nums[nums.length - i - 1] = temp;
		}
    }
}