package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TestMain {
	public static ArrayList<Long> primes = new ArrayList<>();

	public static final int MAX_VALUE = 10000000;

	public static HashMap<Long, Long> values = new HashMap<>();

	public static void main(String[] args) {
		init();

		System.out.println(solve(MAX_VALUE));
	}

	public static void init() {
		boolean[] check = new boolean[MAX_VALUE / 2 + 1];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add((long) i);
			}
		}

		for (int i = 0; i < primes.size(); i++) {
			for (int j = i + 1; j < primes.size(); j++) {
				long a = primes.get(i);
				long b = primes.get(j);

				for (long x = a; x <= MAX_VALUE; x *= a) {
					for (long y = b; x * y <= MAX_VALUE; y *= b) {
						values.put(x * y, a * b);
					}
				}
			}
		}
	}

	public static long solve(long n) {
		HashSet<Long> set = new HashSet<>();

		long result = 0;

		for (long i = n; i >= 6; i--) {
			if (values.containsKey(i)) {
				long mul = values.get(i);

				if (!set.contains(mul)) {
					set.add(mul);
					result += i;
				}
			}
		}

		return result;
	}
}