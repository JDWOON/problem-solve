package test;

import java.math.BigDecimal;

public class TestMain {
	public static void main(String[] args) {
		int val = 0;

		for (int i = 1; i <= 100; i++) {
			val += getVal(i);
		}

		System.out.println(val);
	}

	public static int getVal(int n) {
		String s = "";

		for (int i = 1; i <= 10; i++) {
			if (i * i == n) {
				return 0;
			} else if (i * i < n && (i + 1) * (i + 1) > n) {
				s += i + ".";
			}
		}
		BigDecimal target = new BigDecimal(n);

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 9) {
					s += "9";
					break;
				}

				BigDecimal next = new BigDecimal(s + Integer.toString(j + 1));

				if (next.multiply(next).compareTo(target) == 1) {
					s += Integer.toString(j);
					break;
				}
			}
		}

		int result = Integer.parseInt("" + s.charAt(0));

		for (int i = 2; i < 101; i++) {
			result += Integer.parseInt("" + s.charAt(i));
		}

		return result;
	}
}
