package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		BigInteger a = new BigInteger("1");
		BigInteger b = new BigInteger("1");

		int cnt = 1;

		while (a.toString().length() < 1000) {
			BigInteger temp = a.add(b);
			a = b;
			b = temp;
			cnt++;
		}

		System.out.println(cnt);
	}
}
