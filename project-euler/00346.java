package test;

import java.util.HashMap;

public class TestMain {
	public static long MAX_VALUE = 1000000000000L;

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		HashMap<Long, Integer> map = new HashMap<>();

		for (long i = 2; i < 1000000; i++) {
			long temp = i * i + i + 1;

			while (temp < MAX_VALUE) {
				if (map.containsKey(temp)) {
					map.put(temp, map.get(temp) + 1);
				} else {
					map.put(temp, 1);
				}

				temp *= i;
				temp++;
			}
		}

		long sum = 1;

		for (long key : map.keySet()) {
			if (map.get(key) > 0 && key < MAX_VALUE) {
				sum += key;
			}

		}

		return sum;
	}
}