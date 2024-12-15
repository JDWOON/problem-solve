package leetcode;

public class Solution {
	public int nthUglyNumber(int n) {
		int[] p = new int[n];
		int cnt = 0, xc = 0, yc = 0, zc = 0;
		p[0] = 1;

		while (cnt < n - 1) {
			int x = p[xc] * 2;
			int y = p[yc] * 3;
			int z = p[zc] * 5;
			int min = Math.min(x, Math.min(y, z));

			cnt++;
			p[cnt] = min;

			if (min == x) {
				xc++;
			}
			if (min == y) {
				yc++;
			}
			if (min == z) {
				zc++;
			}
		}

		return p[n - 1];
	}
}