package test;

import java.math.BigInteger;

public class TestMain {
	public static void main(String[] args) {
		int cnt = 0;

		for (int i = 1; i <= 10000; i++) {
			if (isLychrel(new BigInteger(Integer.toString(i)))) {
				cnt++;
			}
		}

		System.out.println(cnt);
	}

	public static boolean isLychrel(BigInteger n) {
		for (int i = 0; i < 50; i++) {
			String s = n.toString();
			BigInteger temp = new BigInteger(new StringBuffer(s).reverse().toString());
			n = n.add(temp);

			if (isPal(n)) {
				return false;
			}
		}

		return true;
	}

	public static boolean isPal(BigInteger n) {
		String s = n.toString();

		return s.equals(new StringBuffer(s).reverse().toString());
	}
}
