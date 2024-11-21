package test;

import java.util.ArrayList;
import java.util.HashSet;

public class TestMain {
	private static long MAX = 100000L;
	private static int LIST_SIZE = 5;

	private static ArrayList<Long> targets = new ArrayList<Long>();
	private static HashSet<Long> primes = new HashSet<Long>();

	private static long minSum = 26034L;

	public static void main(String[] args) {
		for (long i = 2; i < MAX; i++) {
			if (isPrime(i)) {
				targets.add(i);
			}
		}

		solve(new ArrayList<Long>(), 1, 0);

		System.out.println(minSum);
	}

	public static void solve(ArrayList<Long> list, int idx, long nowSum) {
		if (list.size() < LIST_SIZE) {
			if (idx < targets.size()) {
				boolean isAddable = true;

				long a = targets.get(idx);

				if (nowSum + (LIST_SIZE - list.size()) * a < minSum) {
					for (long b : list) {
						if (!check(a, b)) {
							isAddable = false;
							break;
						}
					}

					if (isAddable) {
						list.add(a);

						solve(list, idx + 1, nowSum + a);

						list.remove(a);
					}

					solve(list, idx + 1, nowSum);
				}
			}
		} else if (list.size() == LIST_SIZE) {
			minSum = Math.min(minSum, nowSum);
		}
	}

	public static boolean check(long a, long b) {
		String sa = Long.toString(a);
		String sb = Long.toString(b);

		long x = Long.parseLong(sa + sb);
		long y = Long.parseLong(sb + sa);

		return isPrime(x) && isPrime(y);
	}

	public static boolean isPrime(long n) {
		if (primes.contains(n)) {
			return true;
		}

		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		primes.add(n);

		return true;
	}
}
