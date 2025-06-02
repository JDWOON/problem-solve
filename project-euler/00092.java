package test;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		int result = 0;

		for (int i = 1; i < 10000000; i++) {
			if (check(i)) {
				result++;
			}
		}

		System.out.println(result);
	}

	public static boolean check(int n) {
		boolean result = false;

		HashSet<Integer> set = new HashSet<Integer>();

		while (!set.contains(n)) {
			if (n == 89) {
				return true;
			}

			set.add(n);

			n = next(n);
		}

		return result;
	}

	public static int next(int n) {
		int next = 0;

		while (n > 0) {
			next += (n % 10) * (n % 10);
			n /= 10;
		}

		return next;
	}
}
