package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		long cnt = 0;

		for (int a = 1; a <= 100; a++) {
			for (int b = 1; b <= 100; b++) {
				cnt = Math.max(cnt, getVal(a, b));
			}
		}

		System.out.println(cnt);
	}

	public static long getVal(int a, int b) {
		BigInteger n = new BigInteger(Integer.toString(a)).pow(b);

		long val = 0;

		for (char c : n.toString().toCharArray()) {
			val += (int) (c - '0');
		}

		return val;
	}
}
