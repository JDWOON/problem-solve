package test;

public class TestMain {
	public static int[] arr = new int[16];
	public static int sum = 0;
	public static int cnt = 0;

	public static void main(String[] args) {
		solve(0);

		System.out.println(cnt);
	}

	public static void solve(int idx) {
		if (idx == 16) {
			cnt++;
			return;
		}

		if (idx == 4) {
			sum = arr[0] + arr[1] + arr[2] + arr[3];
		}

		if (idx == 7 || idx == 11 | idx == 15) {
			int temp = sum - (arr[idx - 1] + arr[idx - 2] + arr[idx - 3]);

			if (temp >= 0 && temp <= 9) {
				arr[idx] = temp;
				if (check(idx + 1)) {
					solve(idx + 1);
				}
				arr[idx] = 0;
			}
		} else if (idx == 12 || idx == 13 || idx == 14) {
			int temp = sum - (arr[idx - 4] + arr[idx - 8] + arr[idx - 12]);

			if (temp >= 0 && temp <= 9) {
				arr[idx] = temp;
				if (check(idx + 1)) {
					solve(idx + 1);
				}
				arr[idx] = 0;
			}
		} else {
			for (int i = 0; i <= 9; i++) {
				arr[idx] = i;
				solve(idx + 1);
				arr[idx] = 0;
			}
		}
	}

	public static boolean check(int idx) {
		for (int i = 4; i <= idx; i += 4) {
			if (sum != arr[i - 1] + arr[i - 2] + arr[i - 3] + arr[i - 4]) {
				return false;
			}
		}

		for (int i = 12; i < idx; i++) {
			if (sum != arr[i] + arr[i - 4] + arr[i - 8] + arr[i - 12]) {
				return false;
			}
		}

		if (idx > 12 && sum != arr[12] + arr[9] + arr[6] + arr[3]) {
			return false;
		}

		if (idx > 15 && sum != arr[15] + arr[10] + arr[5] + arr[0]) {
			return false;
		}

		for (int i = 0; idx >= 4 && i < 4; i++) {
			if (arr[i * 4] + arr[i * 4 + 1] + arr[i * 4 + 2] + arr[i * 4 + 3] > sum) {
				return false;
			}

			if (arr[i] + arr[i + 4] + arr[i + 8] + arr[i + 12] > sum) {
				return false;
			}
		}

		return true;
	}
}
