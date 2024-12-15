package leetcode;

public class Solution {
	public int mySqrt(int x) {
		if (x <= 1) {
			return x;
		} else {
			int min = 0, max = x;
			int mid;

			while (min + 1 < max) {
				mid = (min + max) / 2;
				if ((long) mid * mid == (long) x) {
					return mid;
				} else if ((long) mid * mid < (long) x) {
					min = mid;
				} else {
					max = mid;
				}
			}
			return min;
		}
	}
}