package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	public static int maxValue = 1000000000;

	public static long[] divs = new long[] { 2, 3, 5, 7, 11, 13, 17, 19, 23 };

	public static ArrayList<Long> targets = new ArrayList<>();

	public static ArrayList<Long> primes = new ArrayList<>();

	public static void main(String[] args) {
		init();

		getTargets(2, 0);

		System.out.println("done");

		HashSet<Long> luckySet = new HashSet<>();

		for (long val : targets) {
			luckySet.add(getLucky(val));
		}

		long sum = 0;

		for (long lucky : luckySet) {
			sum += lucky;
		}

		System.out.println(sum);
	}

	public static void init() {
		boolean[] check = new boolean[maxValue + 8];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				primes.add((long) i);

				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}
			}
		}

	}

	public static void getTargets(long n, int idx) {
		if (n >= maxValue || targets.contains(n)) {
			return;
		}

		targets.add(n);

		for (int i = 0; i <= idx; i++) {
			getTargets(n * divs[i], idx);
		}

		if (idx + 1 < divs.length) {
			getTargets(n * divs[idx + 1], idx + 1);
		}
	}

	public static long getLucky(long n) {
		for (long prime : primes) {
			if (n + 1 < prime) {
				return prime - n;
			}
		}

		throw new IllegalStateException();
	}
}
