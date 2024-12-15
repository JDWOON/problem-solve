package leetcode;

public class Solution {
	public int minPathSum(int[][] grid) {
		if (grid.length < 1 || grid[0].length < 1) {
			return -1;
		}

		int x = grid.length, y = grid[0].length;

		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				if (i > 0 && j > 0) {
					grid[i][j] += Math.min(grid[i - 1][j], grid[i][j - 1]);
				} else if (i > 0) {
					grid[i][j] += grid[i - 1][j];
				} else if (j > 0) {
					grid[i][j] += grid[i][j - 1];
				}
			}
		}

		return grid[x - 1][y - 1];
	}
}