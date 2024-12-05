package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class TestMain {
	private static HashMap<Long, HashSet<Long>> map = new HashMap<Long, HashSet<Long>>();

	public static void main(String[] args) {
		for (long i = 1; i < 9000; i++) {
			long now = i * i * i;
			long key = getKey(now);

			if (!map.containsKey(key)) {
				map.put(key, new HashSet<Long>());
			}

			map.get(key).add(now);
		}

		for (long key : map.keySet()) {
			if (map.get(key).size() == 5) {
				long result = Long.MAX_VALUE;

				for (long n : map.get(key)) {
					result = Math.min(result, n);
				}

				System.out.println(map.get(key));
				System.out.println(result);
			}
		}
	}

	public static long getKey(long n) {
		long[] counts = new long[10];
		Arrays.fill(counts, 0);

		while (n > 0) {
			counts[(int) (n % 10)]++;
			n /= 10;
		}

		long result = 0;

		for (long count : counts) {
			result *= 10;
			result += count;
		}

		return result;
	}
}
