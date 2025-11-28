package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;

public class TestMain {
	public static int MAX_VALUE = 120000;

	public static HashMap<Long, Long> rads = new HashMap<>();

	public static HashMap<Long, LinkedHashSet<Long>> facts = new HashMap<>();

	public static void main(String[] args) {
		init();

		System.out.println(solve(MAX_VALUE));
	}

	public static void init() {
		boolean[] check = new boolean[MAX_VALUE];
		Arrays.fill(check, true);

		facts.put(1L, new LinkedHashSet<>());
		facts.get(1L).add(1L);
		rads.put(1L, 1L);

		for (int i = 2; i < check.length; i++) {
			if (check[i]) {
				for (int j = 1; i * j < check.length; j++) {
					facts.putIfAbsent((long) i * j, new LinkedHashSet<>());
					facts.get((long) i * j).add((long) i);

					rads.putIfAbsent((long) i * j, 1L);
					rads.put((long) i * j, rads.get((long) i * j) * i);

					check[i * j] = false;
				}
			}
		}
	}

	public static long solve(long max) {
		int result = 0;

		for (long c = 1; c < max; c++) {
			for (long a = 1; a < c - a; a++) {
				long b = c - a;

				if (disjoint(a, b) && disjoint(a, c) && disjoint(b, c) && rads.get(a) * rads.get(b) * rads.get(c) < c) {
					result += c;
				}
			}
		}

		return result;
	}

	public static boolean disjoint(long a, long b) {
		LinkedHashSet<Long> set = new LinkedHashSet<>();

		set = new LinkedHashSet<>();
		set.addAll(facts.get(a));
		set.addAll(facts.get(b));

		return set.size() == facts.get(a).size() + facts.get(b).size();
	}
}
