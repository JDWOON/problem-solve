package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		BigInteger n = new BigInteger("1000000030");

		while (true) {
			if (check(n.pow(2))) {
				System.out.println(n);
				break;
			}

			n = n.add(new BigInteger("40"));

			if (check(n.pow(2))) {
				System.out.println(n);
				break;
			}

			n = n.add(new BigInteger("60"));
		}
	}

	public static boolean check(BigInteger n) {
		return n.toString().matches("1.2.3.4.5.6.7.8.900");
	}
}