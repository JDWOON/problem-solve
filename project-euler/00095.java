package test;

import java.util.ArrayList;
import java.util.Arrays;

public class TestMain {
	public static int MAX_SIZE = 1000000;
	public static int[] val = new int[MAX_SIZE + 1];

	public static void main(String[] args) {
		Arrays.fill(val, 0);

		int idx = 0;

		for (int i = 1; i <= MAX_SIZE; i++) {
			if (val[idx] < getVal(i)) {
				idx = i;
			}
		}

		int result = idx;

		for (int i = cal(idx); i != idx; i = cal(i)) {
			result = Math.min(result, i);
		}

		System.out.println(result);
	}

	public static int getVal(int n) {
		if (val[n] != 0) {
			return val[n];
		} else {
			ArrayList<Integer> list = new ArrayList<Integer>();

			int temp = n;

			while (!list.contains(temp) && temp <= MAX_SIZE) {
				if (val[temp] != 0) {
					val[n] = -1;
					return val[n];
				}
				list.add(temp);
				temp = cal(temp);
			}

			if (temp > MAX_SIZE) {
				for (int idx : list) {
					val[idx] = -1;
				}
			} else {
				while (list.get(0) != temp) {
					list.remove(0);
				}

				for (int idx : list) {
					val[idx] = list.size();
				}

				if (temp != n) {
					val[n] = -1;
				}
			}

			return val[n];
		}
	}

	public static int cal(int n) {
		int result = 0;

		for (int i = 1; i * i <= n; i++) {
			if (n % i == 0) {
				result += i;

				if (i * i != n) {
					result += n / i;
				}
			}
		}

		return result - n;
	}
}
