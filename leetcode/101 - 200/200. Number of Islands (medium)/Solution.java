package leetcode;

public class Solution {
	public int numIslands(char[][] grid) {
		int p = 0;

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					rmIsland(grid, i, j);
					p++;
				}
			}
		}

		return p;
	}

	public void rmIsland(char[][] grid, int x, int y) {
		if (x < 0 || y < 0 || x > grid.length - 1 || y > grid[0].length - 1) {
			return;
		} else if (grid[x][y] == '1') {
			grid[x][y] = '0';
			rmIsland(grid, x - 1, y);
			rmIsland(grid, x + 1, y);
			rmIsland(grid, x, y + 1);
			rmIsland(grid, x, y - 1);
		}
	}
}