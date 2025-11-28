package test;

public class TestMain {
	public static void main(String[] args) {
		solve();
	}

	public static void solve() {
		long cnt = 0;

		for (long i = 1; i < 10000000; i++) {
			long temp = i + 1;

			while (temp % 2 == 0) {
				temp /= 2;
			}

			if (temp == 1) {
				cnt++;
			}

			if (i > 12345 * cnt) {
				System.out.println(i * (i + 1));
				return;
			}
		}
	}
}
