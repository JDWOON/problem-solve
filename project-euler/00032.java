package test;

import java.util.HashSet;

public class TestMain {
	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();

		for (int i = 1; i < 10000; i++) {
			for (int j = 1; j < 10000; j++) {
				if (isPandigital(i, j)) {
					hs.add(i * j);
				}
			}
		}

		int sum = 0;

		for (int c : hs) {
			sum += c;
		}

		System.out.println(sum);
	}

	public static boolean isPandigital(int a, int b) {
		boolean[] check = new boolean[10];
		int[] val = new int[] { a, b, a * b };

		for (int i = 0; i < val.length; i++) {
			for (int j = 1; j < val[i]; j *= 10) {
				int temp = (val[i] / j) % 10;

				if (temp == 0 || check[temp]) {
					return false;
				}

				check[temp] = true;
			}
		}

		for (int i = 1; i <= 9; i++) {
			if (!check[i]) {
				return false;
			}
		}

		return true;
	}
}
