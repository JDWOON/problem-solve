package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static int MAX_VALUE = 12000;
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		init();

		int sum = 0;

		for (int d = 4; d <= 12000; d++) {
			for (int n = (d + 2) / 3; n < (d + 1) / 2; n++) {
				if (check(n, d)) {
					sum++;
				}
			}
		}

		System.out.println(sum);
	}

	public static void init() {
		boolean[] temp = new boolean[MAX_VALUE + 1];
		Arrays.fill(temp, true);

		for (int i = 2; i < temp.length; i++) {
			if (temp[i]) {
				primes.add(i);

				for (int j = 2; i * j < temp.length; j++) {
					temp[i * j] = false;
				}
			}
		}
	}

	public static boolean check(int n, int d) {
		for (int prime : primes) {
			if (n < prime) {
				break;
			} else if (n % prime == 0 && d % prime == 0) {
				return false;
			}
		}

		return true;
	}
}
