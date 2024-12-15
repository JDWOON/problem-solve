package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix) {
		List<Integer> result = new ArrayList<Integer>();

		if (matrix.length < 1) {
			return result;
		}

		int m = matrix.length;
		int n = matrix[0].length;
		int v = 0, x = 0, y = 0, k = 0;

		for (int i = 0; i < m * n; i++) {
			if (v == 0) {
				result.add(matrix[x][y]);
				if (y < n - k - 1) {
					y++;
				} else {
					v = 1;
					x++;
				}
			} else if (v == 1) {
				result.add(matrix[x][y]);
				if (x < m - k - 1) {
					x++;
				} else {
					v = 2;
					y--;
				}
			} else if (v == 2) {
				result.add(matrix[x][y]);
				if (y > k) {
					y--;
				} else {
					v = 3;
					k++;
					x--;
				}
			} else if (v == 3) {
				result.add(matrix[x][y]);
				if (x > k) {
					x--;
				} else {
					v = 0;
					y++;
				}
			}
		}

		return result;
	}
}