package test;

import java.util.HashSet;

public class TestMain {
	private static HashSet<Long> pList = new HashSet<Long>();
	private static HashSet<Long> sList = new HashSet<Long>();

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		long n = 2;

		long si = 1, sv = 1;

		while (true) {
			if (isPrime(n)) {
				pList.add(n);
			} else {
				if (sv <= n) {
					sList.add(sv);
					si++;
					sv = si * si;
				}

				if (n % 2 == 1) {
					boolean isValid = false;

					for (long p : pList) {
						for (long s : sList) {
							if (n == p + (s * 2)) {
								isValid = true;
								break;
							}
						}

						if (isValid) {
							break;
						}
					}

					if (!isValid) {
						return n;
					}
				}
			}

			n++;
		}
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
