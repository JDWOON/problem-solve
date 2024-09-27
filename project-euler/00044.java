package test;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static int solve() {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 1; i < 3000; i++) {
			list.add(i * (3 * i - 1) / 2);
		}

		int d = Integer.MAX_VALUE;

		for (int i = 1; i < list.size(); i++) {
			for (int j = 0; j < i; j++) {
				int a = list.get(i);
				int b = list.get(j);

				if (list.contains(a + b) && list.contains(a - b)) {
					d = Math.min(d, a - b);
				}
			}
		}

		return d;
	}
}
