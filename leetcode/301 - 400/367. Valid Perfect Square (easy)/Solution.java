package leetcode;

public class Solution {
	public boolean isPerfectSquare(int num) {
		for (int i = 1; i * i <= num && i <= 46340; i++) {
			if (i * i == num) {
				return true;
			}
		}
		return false;
	}
}