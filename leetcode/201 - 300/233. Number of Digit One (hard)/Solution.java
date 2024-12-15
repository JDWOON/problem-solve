package leetcode;

public class Solution {
	public int countDigitOne(int n) {
		int p = 0, k = 1000000000;

		for (int i = 9; i >= 0; i--) {
			if (n / k >= 2) {
				p += i * (k / 10) * (n / k) + k;
			} else if (n / k == 1) {
				p += i * (k / 10) + (n - k + 1);
			}
			n %= k;
			k /= 10;
		}
		
		return p;
	}
}