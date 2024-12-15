package leetcode;

public class Solution {
	public int removeElement(int[] nums, int val) {
		int cnt = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == val) {
				cnt++;
			}
		}
		for (int i = 0, j = nums.length - 1; i < j; i++) {
			if (nums[i] == val) {
				while (nums[j] == val && j > 0) {
					j--;
				}
				if (i < j) {
					nums[i] = nums[j];
					nums[j] = val;
				}
			}
		}

		return nums.length - cnt;
	}
}