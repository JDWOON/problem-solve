package test;

import java.util.HashSet;

public class TestMain {
	public static final long mod = 100000000;
	public static final long x = 1777;
	public static final long y = 1855;
	public static long cycle;

	public static void main(String[] args) {
		init();

		System.out.println(solve(x, y));
	}

	public static void init() {
		HashSet<Long> set = new HashSet<>();

		long temp = x;

		while (true) {
			if (set.contains(temp)) {
				cycle = set.size();
				return;
			}

			set.add(temp);

			temp = (temp * x) % mod;
		}
	}

	public static long solve(long a, long b) {
		return tetration(a, b);
	}

	public static long tetration(long a, long b) {
		if (b == 1) {
			return a % mod;
		} else {
			long result = a;

			for (long i = 1; i < b; i++) {
				result = pmod(a, result % (cycle * mod));
			}

			return result;
		}
	}

	public static long pmod(long a, long b) {
		String s = Long.toString(b, 2);

		long result = 1;
		long temp = a;

		for (int i = s.length() - 1; i >= 0; i--) {
			if (s.charAt(i) == '1') {
				result = (result * temp) % mod;
			}

			temp = (temp * temp) % mod;
		}

		return result;
	}
}
