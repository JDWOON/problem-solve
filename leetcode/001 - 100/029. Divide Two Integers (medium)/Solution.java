package leetcode;

// It's not clean.
public class Solution {
	public int divide(int dividend, int divisor) {
		boolean sign = true;
		long a = dividend, b = divisor;
		long p = 0;

		if (divisor == 0) {
			return Integer.MAX_VALUE;
		}

		if (dividend < 0) {
			sign = !sign;
			a = 0 - a;
		}

		if (divisor < 0) {
			sign = !sign;
			b = 0 - b;
		}
		if (b == 1) {
			p = a;
		} else if (b == 2) {
			p = a >> 1;
		} else {
			while (a >= b * 50000) {
				a = a - b * 50000;
				p = p + 50000;
			}
			while (a >= b) {
				a = a - b;
				p++;
			}
		}

		if (!sign) {
			p = 0 - p;
		}

		if (p <= Integer.MAX_VALUE && p >= Integer.MIN_VALUE) {
			return (int) p;
		} else {
			return Integer.MAX_VALUE;
		}
	}
}