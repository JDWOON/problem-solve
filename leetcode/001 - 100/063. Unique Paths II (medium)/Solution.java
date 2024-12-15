package leetcode;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		if (obstacleGrid.length < 1 || obstacleGrid[0].length < 1 || obstacleGrid[0][0] == 1) {
			return 0;
		} else {
			int height = obstacleGrid.length, width = obstacleGrid[0].length;

			if (obstacleGrid[height - 1][width - 1] == 1) {
				return 0;
			}

			obstacleGrid[0][0] = -1;

			for (int i = 0; i < height; i++) {
				for (int j = 0; j < width; j++) {
					if (obstacleGrid[i][j] == 0) {
						if (i > 0 && obstacleGrid[i - 1][j] != 1) {
							obstacleGrid[i][j] += obstacleGrid[i - 1][j];
						}

						if (j > 0 && obstacleGrid[i][j - 1] != 1) {
							obstacleGrid[i][j] += obstacleGrid[i][j - 1];
						}
					}
				}
			}

			return -obstacleGrid[height - 1][width - 1];
		}
	}
}