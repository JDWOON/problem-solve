package leetcode;

public class Solution {
	public boolean exist(char[][] board, String word) {

		if (word.length() < 1) {
			return true;
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (board[i][j] == word.charAt(0)) {
					int[] xList = new int[word.length()];
					int[] yList = new int[word.length()];
					if (word.length() == 1) {
						return true;
					} else if (adExist(board, word.substring(1), i, j, xList, yList, 0)) {
						return true;
					}
				}
			}
		}

		return false;
	}

	public boolean adExist(char[][] board, String word, int x, int y, int[] xList, int[] yList, int now) {
		for (int i = 0; i < now; i++) {
			if (xList[i] == x && yList[i] == y) {
				return false;
			}
		}
		
		xList[now]=x;
		yList[now]=y;

		if (word.length() < 1) {
			return true;
		}

		if (x > 0 && board[x - 1][y] == word.charAt(0)) {
			if (adExist(board, word.substring(1), x - 1, y, xList, yList, now + 1)) {
				return true;
			}
		}

		if (y > 0 && board[x][y - 1] == word.charAt(0)) {
			if (adExist(board, word.substring(1), x, y - 1, xList, yList, now + 1)) {
				return true;
			}
		}

		if (x < board.length - 1 && board[x + 1][y] == word.charAt(0)) {
			if (adExist(board, word.substring(1), x + 1, y, xList, yList, now + 1)) {
				return true;
			}
		}

		if (y < board[0].length - 1 && board[x][y + 1] == word.charAt(0)) {
			if (adExist(board, word.substring(1), x, y + 1, xList, yList, now + 1)) {
				return true;
			}
		}
		return false;
	}
}