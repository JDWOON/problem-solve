package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		int max = -1;
		int result = -1;

		for (int i = 1; i < 1000; i++) {
			int now = getLen(new BigInteger(Integer.toString(i)));

			if (now > max) {
				max = now;
				result = i;
			}
		}

		System.out.println(result);
	}

	public static int getLen(BigInteger n) {
		BigInteger temp = new BigInteger("9");

		for (long i = 1; i < 2000; i++) {
			if (temp.add(BigInteger.ONE).mod(n).compareTo(BigInteger.ZERO) == 0) {
				return 0;
			} else if (temp.mod(n).compareTo(BigInteger.ZERO) == 0) {
				return temp.toString().length();
			}

			temp = temp.multiply(BigInteger.TEN).add(new BigInteger("9"));
		}

		return -1;
	}
}
