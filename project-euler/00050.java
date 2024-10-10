package test;

import java.util.ArrayList;

public class TestMain {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();

		for (int i = 2; i < 1000000; i++) {
			if (isPrime(i)) {
				list.add(i);
			}
		}

		int len = 0, val = 0;

		for (int i = 0; i < list.size(); i++) {
			int sum = 0;
			for (int j = i; j < list.size(); j++) {
				sum += list.get(j);

				if (sum > list.get(list.size() - 1)) {
					break;
				}

				if (list.contains(sum) && len < j - i + 1) {
					len = j - i + 1;
					val = sum;
				}
			}

		}

		System.out.println(val);
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
