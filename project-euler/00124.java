package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class TestMain {
	public static ArrayList<Integer> primes = new ArrayList<Integer>();

	public static void main(String[] args) {
		init();

		ArrayList<Value> list = new ArrayList<Value>();

		for (int i = 1; i <= 100000; i++) {
			list.add(new Value(i));
		}

		list.sort(new Comparator<Value>() {
			@Override
			public int compare(Value o1, Value o2) {
				if (o1.rad == o2.rad) {
					return Integer.compare(o1.num, o2.num);
				} else {
					return Integer.compare(o1.rad, o2.rad);
				}
			}
		});

		System.out.println(list.get(9999).num);
	}

	public static void init() {
		boolean[] check = new boolean[100001];
		Arrays.fill(check, true);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 2; i * j < check.length; j++) {
					check[i * j] = false;
				}

				primes.add(i);
			}
		}
	}

	static class Value {
		public int num;
		public int rad;

		Value(int num) {
			this.num = num;
			this.rad = 1;

			for (int prime : primes) {
				if (num % prime == 0) {
					this.rad *= prime;
				}

				if (prime > num) {
					break;
				}
			}
		}
	}
}