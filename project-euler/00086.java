package test;

import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	public static HashSet<Long> square = new HashSet<Long>();
	public static long[] dp = new long[10000];

	public static void main(String[] args) {
		for (long i = 1; i < 10000; i++) {
			square.add(i * i);
		}

		Arrays.fill(dp, 0);

		for (int i = 1; i < 10000; i++) {
			if (solve(i) > 1000000) {
				System.out.println(i);
				break;
			}
		}
	}

	public static boolean check(long a, long b, long c) {
		long temp = (a + b) * (a + b) + c * c;
		temp = Math.min(temp, a * a + (b + c) * (b + c));
		temp = Math.min(temp, (a + c) * (a + c) + b * b);

		return square.contains(temp);
	}

	public static long solve(int m) {
		if (dp[m] > 0) {
			return dp[m];
		} else if (m < 1) {
			return 0;
		}

		long cnt = solve(m - 1);

		for (long a = 1; a <= m; a++) {
			for (long b = a; b <= m; b++) {
				if (check(m, a, b)) {
					cnt++;
				}
			}
		}

		dp[m] = cnt;

		return cnt;
	}
}
