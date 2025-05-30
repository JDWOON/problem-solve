package test;

import java.util.HashSet;

public class TestMain {
	public static int[] fact = { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880 };

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		int result = 0;

		for (int i = 1; i < 1000000; i++) {
			HashSet<Integer> set = new HashSet<Integer>();

			int temp = i;

			while (!set.contains(temp)) {
				set.add(temp);
				temp = cal(temp);
			}

			if (set.size() == 60) {
				result++;
			}
		}

		return result;
	}

	public static int cal(int n) {
		int result = 0;

		while (n > 0) {
			result += fact[n % 10];
			n /= 10;
		}

		return result;
	}
}
