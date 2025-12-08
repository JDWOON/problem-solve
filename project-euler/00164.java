package test;

public class TestMain {
	public static long[][][][] dp = new long[21][10][10][10];

	public static void main(String[] args) {
		long cnt = 0;

		for (int i = 1; i <= 9; i++) {
			cnt += solve(1, 0, 0, i);
		}

		System.out.println(cnt);
	}

	public static long solve(int idx, int b1, int b2, int now) {
		if (dp[idx][b1][b2][now] > 0) {
			return dp[idx][b1][b2][now];
		} else if (idx == 20) {
			dp[idx][b1][b2][now] = 1;
			return dp[idx][b1][b2][now];
		} else {
			long cnt = 0;

			for (int i = 0; i < 10; i++) {
				if (b2 + now + i <= 9) {
					cnt += solve(idx + 1, b2, now, i);
				}
			}

			dp[idx][b1][b2][now] = cnt;

			return cnt;
		}
	}
}
