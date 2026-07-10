package test;

public class TestMain {
	private static long dp[][][] = new long[31][3][2];

	public static void main(String[] args) {
		dp[0][0][0] = 1;

		for (int i = 1; i <= 30; i++) {
			// O
			dp[i][0][0] = dp[i - 1][0][0] + dp[i - 1][1][0] + dp[i - 1][2][0];
			dp[i][0][1] = dp[i - 1][0][1] + dp[i - 1][1][1] + dp[i - 1][2][1];

			// A
			dp[i][1][0] = dp[i - 1][0][0];
			dp[i][2][0] = dp[i - 1][1][0];
			dp[i][1][1] = dp[i - 1][0][1];
			dp[i][2][1] = dp[i - 1][1][1];

			// L
			dp[i][0][1] += dp[i - 1][0][0] + dp[i - 1][1][0] + dp[i - 1][2][0];
		}

		// 30 total
		System.out.println(dp[30][0][0] + dp[30][1][0] + dp[30][2][0] + dp[30][0][1] + dp[30][1][1] + dp[30][2][1]);
	}
}
