package test;

import java.util.HashSet;

public class TestMain {
	private static HashSet<Integer> pList = new HashSet<Integer>();

	public static void main(String[] args) {
		int score = 0, a = 0, b = 0;

		for (int i = -999; i < 1000; i++) {
			for (int j = -999; j < 1000; j++) {
				int now = getScore(i, j);

				if (now > score) {
					a = i;
					b = j;
					score = now;
				}
			}
		}

		System.out.println(a * b);
	}

	public static int getScore(int a, int b) {
		for (int i = 0; i < 1000; i++) {
			int temp = (i * i) + (a * i) + b;

			if (!isPrime(temp)) {
				return i - 1;
			}
		}

		return Integer.MAX_VALUE;
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		} else if (pList.contains(n)) {
			return true;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		pList.add(n);
		return true;
	}
}
