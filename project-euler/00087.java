package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static int MAX_SIZE = 50000000;

	public static ArrayList<Integer>[] primes = new ArrayList[4];

	public static void main(String[] args) {
		init();

		boolean[] check = new boolean[MAX_SIZE + 1];
		Arrays.fill(check, false);

		for (int a : primes[1]) {
			for (int b : primes[2]) {
				for (int c : primes[3]) {
					int temp = a + b + c;

					if (a + b + c < MAX_SIZE) {
						check[temp] = true;
					}
				}
			}
		}

		int result = 0;

		for (int i = 1; i < check.length; i++) {
			if (check[i]) {
				result++;
			}
		}

		System.out.println(result);
	}

	public static void init() {
		boolean[] check = new boolean[8000];
		Arrays.fill(check, true);

		for (int i = 0; i < primes.length; i++) {
			primes[i] = new ArrayList<Integer>();
		}

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				primes[0].add(i);

				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}
			}
		}

		for (int prime : primes[0]) {
			long temp = prime;

			for (int i = 1; i < 4; i++) {
				temp *= prime;

				if (temp < MAX_SIZE) {
					primes[i].add((int) temp);
				}
			}
		}
	}
}
