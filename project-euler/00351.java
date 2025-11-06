package test;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class TestMain {
	public static int MAX_VALUE = 100000000;

	public static LinkedHashSet<Integer> primes = new LinkedHashSet<>();

	public static long[] dp = new long[MAX_VALUE + 1];

	public static void main(String[] args) {
		init();

		System.out.println(solve(MAX_VALUE));
	}

	public static void init() {
		boolean[] check = new boolean[MAX_VALUE + 1];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add(i);
			}
		}

		dp[1] = 1;
	}

	public static long solve(long n) {
		long cnt = 0;

		for (int i = 2; i <= n; i++) {
			cnt += eulerPi(i);
		}

		long result = (3 * n * (n + 1)) - 6 * (cnt + 1);

		return result;
	}

	public static long eulerPi(int a) {
		if (dp[a] > 0) {
			return dp[a];
		}

		if (primes.contains(a)) {
			dp[a] = a - 1;
			return dp[a];
		}

		for (long prime : primes) {
			long mul = 1;
			int temp = a;

			if (temp % prime == 0) {
				while (temp % prime == 0) {
					temp /= prime;
					mul *= prime;
				}

				dp[a] = (mul - mul / prime) * eulerPi(temp);

				return dp[a];
			}

		}

		return -1;
	}
}
