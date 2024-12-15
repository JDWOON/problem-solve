package leetcode;

public class Solution {
	public int findNthDigit(int n) {
		int a, b = 9, num = 0;

		for (a = 0; n > num && a < 9; a++) {
			n -= num;
			num = (a + 1) * b;
			b *= 10;
		}

		num = (n - 1) / a + (int) Math.pow(10, a - 1);
		n = (n - 1) % a + 1;

		for (b = 0; b < a - n; b++) {
			num /= 10;
		}

		return num % 10;
	}
}