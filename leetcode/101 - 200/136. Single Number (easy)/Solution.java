package leetcode;

public class Solution {
	public int singleNumber(int[] nums) {
		int p = 0;
		for (int i = 0; i < nums.length; i++) {
			p = p ^ nums[i];
		}
		return p;
	}
}