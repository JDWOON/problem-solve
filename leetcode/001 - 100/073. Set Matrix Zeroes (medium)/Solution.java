package leetcode;

public class Solution {
	public void setZeroes(int[][] matrix) {
		if (matrix.length < 1 || matrix[0].length < 1) {
			return;
		}

		boolean row = false, col = false;

		// check row 0
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				row = true;
				break;
			}
		}

		// check col 0
		for (int i = 0; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				col = true;
				break;
			}
		}

		// check row & col 1~end
		for (int i = 1; i < matrix.length; i++) {
			for (int j = 1; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][0] = 0;
					matrix[0][j] = 0;
				}
			}
		}

		// set row 0, except first line
		for (int i = 1; i < matrix.length; i++) {
			if (matrix[i][0] == 0) {
				for (int j = 1; j < matrix[0].length; j++) {
					matrix[i][j] = 0;
				}
			}
		}

		// set col 0, except first line
		for (int i = 1; i < matrix[0].length; i++) {
			if (matrix[0][i] == 0) {
				for (int j = 1; j < matrix.length; j++) {
					matrix[j][i] = 0;
				}
			}
		}

		// set first line 0
		if (row) {
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][0] = 0;
			}
		}

		if (col) {
			for (int i = 0; i < matrix[0].length; i++) {
				matrix[0][i] = 0;
			}
		}

	}
}