package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1000; i < 10000; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}

		for (int i = 0; i < list.size(); i++) {
			int a = list.get(i);
			for (int j = i + 1; j < list.size(); j++) {
				int b = list.get(j);

				if (check(a, b) && list.contains(2 * b - a) && check(a, 2 * b - a)) {
//					System.out.println(a + "/" + b + "/" + (2 * b - a));
					System.out.println(a + "" + b + "" + (2 * b - a));
				}
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

	public static boolean check(int a, int b) {
		char[] caa = Integer.toString(a).toCharArray();
		char[] cab = Integer.toString(b).toCharArray();
		Arrays.sort(caa);
		Arrays.sort(cab);

		return new String(caa).equals(new String(cab));
	}
}
