package test;

import java.util.Arrays;
import java.util.HashSet;

public class TestMain {
	private static int[] coins = { 200, 100, 50, 20, 10, 5, 2, 1 };
	private static HashSet<String> set = new HashSet<String>();

	public static void main(String[] args) {
		int[] now = { 0, 0, 0, 0, 0, 0, 0, 0 };

		work(now, 0);

		System.out.println(set.size());
	}

	public static void work(int[] now, int p) {
		int sum = 0;

		for (int i = 0; i < now.length; i++) {
			sum += now[i] * coins[i];
		}

		if (sum == 200) {
			set.add(Arrays.toString(now));
		} else if (sum < 200) {
			for (int i = p; i < now.length; i++) {
				now[i]++;
				work(now, i);
				now[i]--;
			}
		}
	}
}
