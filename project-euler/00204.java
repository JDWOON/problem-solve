package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static final long max = 1000000000;
	public static final int n = 100;

	public static ArrayList<Integer> primes = new ArrayList<>();

	public static long result = 1;

	public static void main(String[] args) {
		init();

		solve(1, 0);

		System.out.println(result);
	}

	public static void init() {
		boolean[] check = new boolean[n + 1];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				primes.add(i);

				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}
			}
		}
	}

	public static void solve(long now, int idx) {
		if (idx < primes.size()) {
			solve(now, idx + 1);

			now *= primes.get(idx);

			if (now <= max) {
				result++;

				solve(now, idx);
			}
		}
	}
}
