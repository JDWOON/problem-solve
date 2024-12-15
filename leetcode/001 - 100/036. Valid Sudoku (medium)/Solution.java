package leetcode;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
		for (int i = 0; i < 9; i++) {
			for (int j = 0; j < 9; j++) {
				for (int k = j + 1; k < 9; k++) {
					if (board[i][j] != '.' && board[i][j] == board[i][k]) {
						return false;
					}
					if (board[j][i] != '.' && board[j][i] == board[k][i]) {
						return false;
					}
				}

				for (int k = (i % 3) * 3 + (j % 3) + 1; k < 9; k++) {
					if (board[i][j]!='.' && board[i][j] == board[(i / 3) * 3 + (k / 3)][(j / 3) * 3 + (k % 3)]) {
						return false;
					}
				}
			}
		}
		return true;
    }
}