package test;

import java.util.HashSet;
import java.util.TreeSet;

public class TestMain {
	public static HashSet<Integer> primes = new HashSet<Integer>();
	public static HashSet<Integer> nums = new HashSet<Integer>();
	public static HashSet<String> results = new HashSet<String>();

	public static void main(String[] args) {
		init(0);

		for (int n : nums) {
			solve(n, new TreeSet<Integer>(), Integer.toString(n));
		}

		System.out.println(results.size());
	}

	public static void init(int n) {
		if (n > 100000000) {
			nums.add(n);
		}

		if (isPrime(n)) {
			primes.add(n);
		}

		for (int i = 1; i <= 9; i++) {
			if (!contains(n, i)) {
				init(n * 10 + i);
			}
		}
	}

	public static boolean contains(int n, int a) {
		while (n > 0) {
			if (n % 10 == a) {
				return true;
			}

			n /= 10;
		}

		return false;
	}

	public static boolean isPrime(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void solve(int n, TreeSet<Integer> list, String next) {
		if (next.isEmpty()) {
			results.add(list.toString());
		}

		for (int i = 1; i <= next.length(); i++) {
			int temp = Integer.parseInt(next.substring(0, i));

			if (primes.contains(temp)) {
				list.add(temp);
				solve(n, list, next.substring(i));
				list.remove(temp);
			}
		}
	}
}