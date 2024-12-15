package leetcode;

public class Solution {
	public double myPow(double x, int n) {
		double binX, p = 1;

		if (x == 0) {
			return 0;
		} else if (n > 0) {
			binX = x;
		} else {
			binX = 1 / x;
		}
		for (int i = n; i != 0; i = i / 2) {
			if (i % 2 != 0) {
				p = p * binX;
			}
			binX = binX * binX;
		}

		return p;
	}
}