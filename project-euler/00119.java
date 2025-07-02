package test;

import java.util.TreeSet;

public class TestMain {
	public static long MAX = 2000000;

	public static TreeSet<Long> set = new TreeSet<Long>();

	public static void main(String[] args) {
		for (long i = 2; i < MAX; i++) {
			long j = i;
			while (j < MAX * MAX) {
				j *= i;

				if (getSum(j) == i) {
					set.add(j);
				}
			}
		}

		System.out.println(set.last());
	}

	public static long getSum(long n) {
		long sum = 0;

		while (n > 0) {
			sum += n % 10;
			n /= 10;
		}

		return sum;
	}
}