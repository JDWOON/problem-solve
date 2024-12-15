package leetcode;

public class Solution {
	public int uniquePaths(int m, int n) {
		long result = 1;
		int j = 2;

		for (int i = Math.max(m, n); i < m + n - 1; i++) {
			result *= i;
			while (j < Math.min(m, n) && result % j == 0) {
				result /= j;
				j++;
			}
		}
		return (int) result;
	}
}