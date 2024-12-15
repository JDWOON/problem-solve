package leetcode;

public class Solution {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		for (int i = 0; i < 16; i++) {
			int left = (n >> (31 - i)) & 1;
			int right = (n >> i) & 1;
			if (left != right) {
				left = 1 << (31 - i);
				right = 1 << i;
				n = n ^ (left | right);
			}
		}
		return n;
	}
}