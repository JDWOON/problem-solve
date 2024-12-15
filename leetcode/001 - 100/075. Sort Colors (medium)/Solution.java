package leetcode;

public class Solution {
	public void sortColors(int[] nums) {
		int a = 0, b = 0;
		for (int i = 0; i < nums.length; i++) {
			int p = nums[i];
			nums[i] = 2;
			if (p == 0) {
				nums[b] = 1;
				nums[a] = 0;
				a++;
				b++;
			} else if (p == 1) {
				nums[b] = 1;
				b++;
			}
		}
	}
}