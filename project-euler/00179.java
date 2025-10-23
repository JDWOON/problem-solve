package test;

import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	public static HashSet<Integer> primes = new HashSet<>();

	public static int MAX = 10000000;

	public static void main(String[] args) throws Exception {
		init();

		int a = 2, b = 2, result = 0;

		for (int i = 2; i < MAX; i++) {
			a = count(i + 1);

			if (a == b) {
				result++;
			}

			b = a;
		}

		System.out.println(result);
	}

	public static void init() {
		boolean[] check = new boolean[MAX];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add(i);
			}
		}
	}

	public static int count(int n) {
		int result = 1;

		for (int prime : primes) {
			int cnt = 0;

			while (n % prime == 0) {
				cnt++;
				n /= prime;
			}

			result *= cnt + 1;

			if (n == 1) {
				return result;
			} else if (primes.contains(n)) {
				return result * 2;
			}
		}

		return -1;
	}
}