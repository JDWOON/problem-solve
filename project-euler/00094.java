package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		BigInteger sum = BigInteger.ZERO;

		for (long a = 3; a < 333333334; a += 2) {
			if (check(a, a + 1)) {
				sum = sum.add(BigInteger.valueOf(3 * a + 1));
			}

			if (check(a, a - 1)) {
				sum = sum.add(BigInteger.valueOf(3 * a - 1));
			}
		}

		System.out.println(sum);
	}

	public static boolean check(long a, long b) {
		if (b % 2 == 1) {
			return false;
		} else {
			BigInteger x = BigInteger.valueOf(a);
			BigInteger y = BigInteger.valueOf(b / 2);
			BigInteger temp = x.multiply(x).subtract(y.multiply(y));

			return temp.sqrtAndRemainder()[1].equals(BigInteger.ZERO);
		}
	}

}