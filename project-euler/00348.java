package test;

import java.util.ArrayList;
import java.util.TreeMap;

public class TestMain {
	public static final long MAX_VALUE = 1000000000;

	public static ArrayList<Long> pa = new ArrayList<>();
	public static ArrayList<Long> pb = new ArrayList<>();

	public static TreeMap<Long, Integer> map = new TreeMap<>();

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		for (long i = 2; i * i < MAX_VALUE; i++) {
			pa.add(i * i);

			if (i * i * i < MAX_VALUE) {
				pb.add(i * i * i);
			}
		}

		for (long a : pa) {
			for (long b : pb) {
				long temp = a + b;

				if (isPal(temp)) {
					if (map.containsKey(temp)) {
						map.put(temp, map.get(temp) + 1);
					} else {
						map.put(temp, 1);
					}
				}
			}
		}

		int cnt = 0;

		long result = 0;

		for (long value : map.keySet()) {
			if (map.get(value) == 4) {
				result += value;
				cnt++;
			}

			if (cnt == 5) {
				return result;
			}
		}

		return -1;
	}

	public static boolean isPal(long n) {
		long r = 0;

		long temp = n;

		while (temp > 0) {
			r *= 10;
			r += temp % 10;
			temp /= 10;
		}

		return n == r;
	}
}