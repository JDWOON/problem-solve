package test;

import java.math.BigInteger;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		int std = 2;
		int[] arr = new int[99];
		Arrays.fill(arr, 1);

		for (int i = 0; 3 * i + 1 < arr.length; i++) {
			arr[3 * i + 1] = 2 * i + 2;
		}

		Value val = solve(std, arr, 99);

		String s = val.n.toString();

		int result = 0;

		for (char c : s.toCharArray()) {
			result += Character.getNumericValue(c);
		}

		System.out.println(result);
	}

	public static Value solve(int std, int[] arr, int idx) {
		if (idx == 0) {
			return new Value(BigInteger.valueOf(std), BigInteger.ONE);
		}

		Value temp = new Value(BigInteger.ONE, BigInteger.valueOf(arr[(idx - 1) % arr.length]));

		for (int i = idx - 2; i >= 0; i--) {
			BigInteger n = temp.d;
			BigInteger d = temp.d.multiply(BigInteger.valueOf(arr[i % arr.length])).add(temp.n);
			temp = new Value(n, d);
		}

		Value result = new Value(temp.n.add(temp.d.multiply(BigInteger.valueOf(std))), temp.d);

		result.div();

		return result;
	}

	public static class Value {
		BigInteger n, d;

		Value(BigInteger n, BigInteger d) {
			this.n = n;
			this.d = d;
		}

		public void div() {
			BigInteger gcd = getGcd(n, d);
			n = n.divide(gcd);
			d = d.divide(gcd);
		}

		public BigInteger getGcd(BigInteger a, BigInteger b) {
			if (b.equals(BigInteger.ZERO)) {
				return a;
			} else {
				return getGcd(b, a.mod(b));
			}
		}
	}
}
