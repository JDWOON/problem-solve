package test;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class TestMain {
	private static LinkedHashMap<Integer, HashSet<String>> map = new LinkedHashMap<Integer, HashSet<String>>();

	static {
		for (int i = 3; i < 9; i++) {
			HashSet<String> list = new HashSet<String>();
			map.put(i, list);
		}

		for (int n = 1; n < 1000; n++) {
			boolean hasNext = false;

			int[] now = new int[9];

			now[3] = n * (n + 1) / 2;
			now[4] = n * n;
			now[5] = n * (3 * n - 1) / 2;
			now[6] = n * (2 * n - 1);
			now[7] = n * (5 * n - 3) / 2;
			now[8] = n * (3 * n - 2);

			for (int i = 3; i < 9; i++) {
				if (now[i] < 10000) {
					hasNext = true;

					if (now[i] > 999) {
						map.get(i).add(Integer.toString(now[i]));
					}
				}
			}

			if (!hasNext) {
				break;
			}
		}
	}

	public static void main(String[] args) {
		solve(new LinkedHashMap<Integer, String>(), null);
	}

	public static void solve(LinkedHashMap<Integer, String> done, String now) {
		if (done.size() == 6) {
			if (now.substring(2).equals(done.get(3).subSequence(0, 2))) {
				int sum = 0;

				for (int key : done.keySet()) {
					sum += Integer.parseInt(done.get(key));
				}

				System.out.println(done);
				System.out.println(sum);
			}
		} else if (done.size() == 0) {
			for (String next : map.get(3)) {
				done.put(3, next);
				solve(done, next);
				done.remove(3);
			}
		} else {
			for (int key : map.keySet()) {
				if (!done.containsKey(key)) {
					for (String next : map.get(key)) {
						if (now.substring(2).equals(next.substring(0, 2))) {
							done.put(key, next);
							solve(done, next);
							done.remove(key, next);
						}
					}
				}
			}
		}
	}
}
