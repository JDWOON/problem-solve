package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		long cnt = 0;

		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 100; b++) {
				BigInteger val = getPow(a, b);
				int len = val.toString().length();

				if (b > len) {
					break;
				} else if (b == len) {
					cnt++;
				}
			}
		}

		System.out.println(cnt);
	}

	public static BigInteger getPow(int a, int b) {
		BigInteger val = BigInteger.ONE;

		while (b > 0) {
			val = val.multiply(new BigInteger(Integer.toString(a)));
			b--;
		}

		return val;
	}
}
