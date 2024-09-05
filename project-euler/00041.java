package test;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		int result = 0;

		for (int i = 1; i <= 87654321; i++) {
			if (check(i)) {
				result = i;
			}
		}

		System.out.println(result);
	}

	public static boolean check(int n) {
		char[] cArr = Integer.toString(n).toCharArray();

		Arrays.sort(cArr);

		for (int i = 0; i < cArr.length; i++) {
			if (cArr[i] != '1' + i) {
				return false;
			}
		}

		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
