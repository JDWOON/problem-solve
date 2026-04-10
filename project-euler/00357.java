package test;

import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	public static final int MAX = 100000001;

	public static HashSet<Integer> set = new HashSet<>();

	public static void main(String[] args) throws Exception {
		init();

		solve();
	}

	public static void init() {
		boolean[] check = new boolean[MAX + 1];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				set.add(i);

				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}
			}
		}
	}

	public static void solve() {
		long sum = 0;

		for (int n = 1; n < MAX; n++) {
			boolean check = true;

			for (int d = 1; d * d <= n; d++) {
				if (n % d == 0) {
					if (!set.contains(d + (n / d))) {
						check = false;
						break;
					}
				}
			}

			if (check) {
				sum += n;
			}
		}

		System.out.println(sum);
	}
}
