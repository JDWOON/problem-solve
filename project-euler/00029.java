package test;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();

		for (int i = 2; i <= 100; i++) {
			for (int j = 2; j <= 100; j++) {
				set.add(getStr(i, j));
			}
		}

		System.out.println(set.size());
	}

	public static String getStr(int a, int b) {
		String result = "";

		for (int i = 2; i <= a; i++) {
			if (a % i == 0) {
				int cnt = 0;

				while (a % i == 0) {
					a /= i;
					cnt++;
				}

				result += "*" + Integer.toString(i) + "^" + Integer.toString(cnt * b);
			}
		}

		return result;
	}
}
