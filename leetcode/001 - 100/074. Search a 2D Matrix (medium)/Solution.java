package leetcode;

import java.util.Arrays;

public class Solution {
	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix.length < 1 || matrix[0].length < 1) {
			return false;
		}

		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][0] <= target && matrix[i][matrix[0].length - 1] >= target) {
				if (Arrays.binarySearch(matrix[i], target) >= 0) {
					return true;
				}
			}
		}

		return false;
	}
}