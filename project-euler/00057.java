package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		BigInteger a = BigInteger.ONE, b = BigInteger.ONE;

		int cnt = 0;

		for (int i = 0; i < 1000; i++) {
			BigInteger temp = a;
			a = b.add(temp);
			b = a.add(temp);

			if (b.toString().length() > a.toString().length()) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}
}
