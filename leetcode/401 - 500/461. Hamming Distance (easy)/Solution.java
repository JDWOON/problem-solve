package leetcode;

public class Solution {
	public int hammingDistance(int x, int y) {
		int k = x ^ y, p = 0;
		while (k > 0) {
			if (k % 2 == 1) {
				p++;
			}
			k = k >> 1;
		}
		return p;
	}
}