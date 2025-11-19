package test;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	public static ArrayList<Long> list = new ArrayList<>();

	public static void main(String[] args) {
		init();

		System.out.println(solve(51));
	}

	public static void init() {
		boolean[] check = new boolean[16000000];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				list.add((long) i * i);
			}
		}
	}

	public static long getVal(long n, long c) {
		c = Math.min(c, n - c);

		BigInteger result = BigInteger.ONE;

		for (long i = n; i > n - c; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}

		for (long i = 2; i <= c; i++) {
			result = result.divide(BigInteger.valueOf(i));
		}

		return result.longValueExact();
	}

	public static boolean isFresh(long n) {
		for (long pd : list) {
			if (n % pd == 0) {
				return false;
			} else if (pd > n) {
				return true;
			}
		}

		return true;
	}

	public static long solve(int n) {
		long sum = 0;

		HashSet<Long> set = new HashSet<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i / 2; j++) {
				long val = getVal(i, j);

				if (!set.contains(val)) {
					if (isFresh(val)) {
						sum += val;
					}

					set.add(val);
				}
			}
		}

		return sum;
	}
}
