package test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class TestMain {
	public static ArrayList<Long> primes = new ArrayList<Long>();

	public static void main(String[] args) {
		for (long i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				primes.add(i);
			}
		}

		System.out.println(solve());
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static long solve() {
		HashMap<Long, HashSet<Long>> map = new HashMap<Long, HashSet<Long>>();

		for (long i = 2; i < 1000000; i++) {
			HashSet<Long> nowSet = pfs(i);

			if (nowSet.size() == 4) {
				HashSet<Long> totalSet = new HashSet<Long>();

				map.put(i, nowSet);

				for (long j = 0; j < 4; j++) {
					if (!map.containsKey(i - j)) {
						break;
					}

					totalSet.addAll(map.get(i - j));

					if (totalSet.size() == 16) {
						return i - j;
					}
				}
			} else {
				map.clear();
			}
		}

		return -1;
	}

	public static HashSet<Long> pfs(long n) {
		HashSet<Long> set = new HashSet<Long>();

		for (long p : primes) {
			long now = 1;

			while (n % p == 0) {
				n /= p;
				now *= p;
			}

			if (now > 1) {
				set.add(now);
			}

			if (n == 1) {
				break;
			}
		}

		return set;
	}
}
