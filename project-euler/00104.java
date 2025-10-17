package test;

import java.math.BigInteger;
import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) throws Exception {
		int idx = 2;
		BigInteger prev = BigInteger.ONE, now = BigInteger.ONE;

		while (true) {
			idx++;
			BigInteger temp = now;
			now = now.add(prev);
			prev = temp;

			String s = now.toString();

			if (s.length() >= 9 && check(s, 0, 9) && check(s, s.length() - 9, s.length())) {
				System.out.println(idx);
				break;
			}
		}
	}

	public static boolean check(String s, int start, int end) {
		HashSet<Character> set = new HashSet<>();

		for (int i = start; i < end; i++) {
			char c = s.charAt(i);

			if (c == '0' || set.contains(c)) {
				return false;
			}

			set.add(c);
		}

		return true;
	}
}