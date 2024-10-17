package test;

import java.util.HashMap;
import java.util.HashSet;

public class TestMain {
	private static HashSet<Integer> set = new HashSet<Integer>();

	private static HashMap<String, Integer> map = new HashMap<String, Integer>();

	public static void main(String[] args) {
		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				set.add(i);
			}
		}

		int result = 0;

		for (int i = 1; i < 1000000; i++) {
			String now = Integer.toString(i);

			int val = solve(now, 0);

			result = Math.max(result, val);

			if (val == 8) {
//				System.out.println(now);
				break;
			}
		}
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static int solve(String s, int idx) {
		if (idx == s.length()) {
			return check(s);
		}

		String temp = s.substring(0, idx) + '*' + s.substring(idx + 1);

		return Math.max(solve(s, idx + 1), solve(temp, idx + 1));
	}

	public static int check(String s) {
		if (!s.contains("*")) {
			return set.contains(Integer.parseInt(s)) ? 1 : 0;
		}

		if (map.containsKey(s)) {
			return map.get(s);
		}

		int cnt = 0;

		for (char c = s.charAt(0) == '*' ? '1' : '0'; c <= '9'; c++) {
			String temp = s.replaceAll("[*]", Character.toString(c));

			if (set.contains(Integer.parseInt(temp))) {
				cnt++;
			}
		}

		if (cnt == 8) {
			System.out.println(s.replaceAll("[*]", s.charAt(0) == '*' ? "1" : "0"));
		}

		map.put(s, cnt);

		return cnt;
	}
}
