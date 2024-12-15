package leetcode;

public class Solution {
	public int[][] generateMatrix(int n) {
		int[][] p = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				p[i][j] = 0;
			}
		}

		int v = 0;
		int a = 0, b = 0;
		for (int i = 1; i <= n * n; i++) {
			if (v == 0) {
				p[a][b] = i;
				if (b + 1 == n || p[a][b + 1] > 0) {
					v = 1;
					a++;
				} else {
					b++;
				}
			} else if (v == 1) {
				p[a][b] = i;
				if (a + 1 == n || p[a + 1][b] > 0) {
					v = 2;
					b--;
				} else {
					a++;
				}
			} else if (v == 2) {
				p[a][b] = i;
				if (b == 0 || p[a][b - 1] > 0) {
					v = 3;
					a--;
				} else {
					b--;
				}
			} else if (v == 3) {
				p[a][b] = i;
				if (a == 0 || p[a - 1][b] > 0) {
					v = 0;
					b++;
				} else {
					a--;
				}
			}
		}

		return p;
	}
}