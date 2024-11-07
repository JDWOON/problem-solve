package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		int cnt = 0;
		
		for (int n = 1; n <= 100; n++) {
			for (int r = 0; r <= n; r++) {
				if (check(n, r)) {
					cnt++;
				}
			}
		}
		
		System.out.println(cnt);
	}

	public static boolean check(int n, int r) {
		BigInteger a = BigInteger.ONE;

		r = Math.min(r, n - r);

		for (int i = n - r + 1; i <= n; i++) {
			a = a.multiply(new BigInteger(Integer.toString(i)));
		}

		for (int i = 2; i <= r; i++) {
			a = a.divide(new BigInteger(Integer.toString(i)));
		}

		return a.compareTo(new BigInteger("1000000")) > 0;
	}
}
