package leetcode;

public class Solution {
	public int removeDuplicates(int[] nums) {
		int cnt = 0;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				cnt++;
			}
		}
		int a = 1, b = 1;
		while (a < nums.length - cnt) {
			if (nums[a] <= nums[a - 1]) {
				while (nums[b] <= nums[a - 1]) {
					b++;
				}
				nums[a] = nums[b];
			}
			a++;
		}

		return nums.length - cnt;
	}
}