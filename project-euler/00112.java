package test;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		int cnt = 0;

		for (int i = 1; i <= 10000000; i++) {
			if (check(i)) {
				cnt++;
			}

			if (cnt * 100 >= i * 99) {
				System.out.println(i);
				break;
			}
		}
	}

	public static boolean check(int n) {
		String s = Integer.toString(n);
		char[] ca = s.toCharArray();
		Arrays.sort(ca);

		StringBuffer sb = new StringBuffer().append(ca);

		String up = sb.toString();
		String down = sb.reverse().toString();

		return !s.equals(up) && !s.equals(down);
	}
}
