package test;

import java.util.HashSet;

public class TestMain {
	public static int[] sq = new int[10000];

	public static void main(String[] args) {
		init();

		long sum = 0;

		HashSet<Long> set = new HashSet<Long>();

		for (int i = 1; i < sq.length; i++) {
			long temp = sq[i];

			for (int j = i + 1; j < sq.length; j++) {
				temp += sq[j];
				if (temp < 100000000 && check(temp) && !set.contains(temp)) {
					set.add(temp);
					sum += temp;
				}
			}
		}

		System.out.println(sum);
	}

	public static void init() {
		for (int i = 0; i < sq.length; i++) {
			sq[i] = i * i;
		}
	}

	public static boolean check(long n) {
		String s = Long.toString(n);

		for (int i = 0; i < s.length() / 2; i++) {
			if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}
}