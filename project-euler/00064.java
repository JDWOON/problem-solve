package test;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		int cnt = 0;

		for (int i = 1; i <= 10000; i++) {
			if (solve(i) % 2 == 1) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	public static int solve(int n) {
		HashSet<String> set = new HashSet<String>();

		int a = (int) Math.floor(Math.sqrt(n));
		int b = 1;
		int c = a;
		int d = 1;

		String key = String.format("%d/%d/%d/%d", a, b, c, d);

		while (!set.contains(key)) {
			set.add(key);

			int tb = d;
			int td = b * (n - c * c);

			int temp = gcd(tb, td);

			tb /= temp;
			td /= temp;

			int ta = (int) Math.floor(tb * (Math.sqrt(n) + c) / td);
			int tc = ta * td - tb * c;

			a = ta;
			b = tb;
			c = tc;
			d = td;
			key = String.format("%d/%d/%d/%d", a, b, c, d);
		}

		return set.size() - 1;
	}

	public static int gcd(int a, int b) {
		int result = 1;

		for (int i = 2; i <= Math.min(a, b); i++) {
			if (a % i == 0 && b % i == 0) {
				result = i;
			}
		}

		return result;
	}
}
