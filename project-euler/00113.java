package test;

import java.math.BigInteger;

public class TestMain {
	public static BigInteger[][][] dp = new BigInteger[101][10][2];

	public static void main(String[] args) {
		System.out.println(solve(100));
	}

	public static BigInteger asc(int len, int start) {
		if (len < 2 || start == 9) {
			return BigInteger.ONE;
		} else if (dp[len][start][0] != null) {
			return dp[len][start][0];
		} else {
			dp[len][start][0] = BigInteger.ZERO;

			for (int i = start; i < 10; i++) {
				dp[len][start][0] = dp[len][start][0].add(asc(len - 1, i));
			}

			return dp[len][start][0];
		}
	}

	public static BigInteger desc(int len, int start) {
		if (len < 2 || start == 0) {
			return BigInteger.ONE;
		} else if (dp[len][start][1] != null) {
			return dp[len][start][1];
		} else {
			dp[len][start][1] = BigInteger.ZERO;

			for (int i = start; i >= 0; i--) {
				dp[len][start][1] = dp[len][start][1].add(desc(len - 1, i));
			}

			return dp[len][start][1];
		}
	}

	public static BigInteger solve(int len) {
		BigInteger sum = BigInteger.valueOf(-len * 9);

		while (len > 0) {
			for (int i = 1; i < 10; i++) {
				sum = sum.add(asc(len, i));
				sum = sum.add(desc(len, i));
			}

			len--;
		}

		return sum;
	}
}