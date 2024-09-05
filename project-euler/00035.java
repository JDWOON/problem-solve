package test;

import java.util.HashSet;

public class TestMain {
	private static final HashSet<Integer> primes = new HashSet<Integer>();
	static {
		for (int i = 2; i < 1000000; i++) {
			boolean isPrime = true;

			for (int j = 2; j * j <= i; j++) {
				if (i % j == 0) {
					isPrime = false;
				}
			}

			if (isPrime) {
				primes.add(i);
			}
		}
	}

	public static void main(String[] args) {
		int cnt = 0;

		for (int i = 2; i < 1000000; i++) {
			if (isCircularPrime(i)) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	public static boolean isCircularPrime(int n) {
		if (primes.contains(n)) {
			String nextStr = rotate(Integer.toString(n));
			int next = Integer.parseInt(nextStr);

			while (next != n) {
				if (!primes.contains(next)) {
					return false;
				}

				nextStr = rotate(nextStr);
				next = Integer.parseInt(nextStr);
			}

			return true;
		}

		return false;
	}

	public static String rotate(String sn) {
		return sn.substring(1) + sn.charAt(0);
	}
}
