package test;

public class TestMain {
	public static long[][] dp = new long[16][16];

	public static void main(String[] args) throws Exception {
		int n = 15;

		long total = fact(n + 1);

		long count = 0;

		for (int i = n / 2 + 1; i <= n; i++) {
			count += solve(n, i);
		}

		System.out.println(total / count);
	}

	public static long solve(int a, int b) {
		if (dp[a][b] > 0) {
			return dp[a][b];
		}

		if (b == 0) {
			dp[a][b] = fact(a);
			return dp[a][b];
		}

		if (a == 0) {
			return 0;
		}

		dp[a][b] = solve(a - 1, b) * a + solve(a - 1, b - 1);

		return dp[a][b];
	}

	public static long fact(int a) {
		long result = 1;

		for (long i = 2; i <= a; i++) {
			result *= i;
		}

		return result;
	}
}