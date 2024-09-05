package test;

import java.util.HashSet;

public class TestMain {
	private static HashSet<Integer> primes = new HashSet<Integer>();
	static {
		primes.add(2);
		primes.add(3);
		primes.add(5);
		primes.add(7);
	}
	private static int maxCheck = 1;

	public static void main(String[] args) {
		int cnt = 0, sum = 0;

		for (int i = 10; cnt < 11; i++) {
			if (isRemovePrime(i)) {
				cnt++;
				sum += i;
			}
		}

		System.out.println(sum);
	}

	public static boolean isRemovePrime(int n) {
		if (!isPrime(n)) {
			return false;
		}

		for (int i = 10; i <= n; i *= 10) {
			if (!isPrime(n / i) || !isPrime(n % i)) {
				return false;
			}
		}

		return true;

	}

	public static boolean isPrime(int n) {
		if (n <= maxCheck) {
			return primes.contains(n);
		}

		maxCheck = n;

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		primes.add(n);

		return true;
	}
}
