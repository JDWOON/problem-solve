package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static ArrayList<Long> primes = new ArrayList<Long>();

	public static void main(String[] args) {
		init();

		System.out.println(solve());
	}

	public static void init() {
		boolean[] check = new boolean[50000000];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add((long) i);
			}
		}
	}

	public static int solve() {
		int result = 0;

		for (int i = 0; i < primes.size(); i++) {
			for (int j = i; j < primes.size(); j++) {
				if (primes.get(i) * primes.get(j) < 100000000) {
					result++;
				} else {
					break;
				}
			}
		}

		return result;
	}
}