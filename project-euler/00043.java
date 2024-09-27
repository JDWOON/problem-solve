package test;

public class TestMain {
	private static long sum = 0;

	public static void main(String[] args) {
		solve("");

		System.out.println(sum);
	}

	public static void solve(String now) {
		if (now.indexOf('0') == 0) {
			return;
		} else if (now.length() == 10) {
			long n = Long.parseLong(now);

			if (check(n)) {
				sum += n;
			}
		} else {
			for (char c = '0'; c <= '9'; c++) {
				if (now.indexOf(c) < 0) {
					solve(now + c);
				}
			}
		}
	}

	public static boolean check(long n) {
		if ((n / 1000000) % 1000 % 2 != 0) {
			return false;
		}

		if ((n / 100000) % 1000 % 3 != 0) {
			return false;
		}

		if ((n / 10000) % 1000 % 5 != 0) {
			return false;
		}

		if ((n / 1000) % 1000 % 7 != 0) {
			return false;
		}

		if ((n / 100) % 1000 % 11 != 0) {
			return false;
		}

		if ((n / 10) % 1000 % 13 != 0) {
			return false;
		}

		if (n % 1000 % 17 != 0) {
			return false;
		}

		return true;
	}
}
