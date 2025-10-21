package test;

public class TestMain {
	public static void main(String[] args) throws Exception {
		System.out.println(check(4));

		for (long n = 2; n < 1000000; n++) {
			int cnt = check(n);

			if (cnt > 1000) {
				System.out.println(n + " -> " + cnt);
				break;
			}
		}
	}

	public static int check(long n) {
		int result = 2;

		for (long i = 2; i < n; i++) {
			if (((n % i) * (n % i)) % i == 0) {
				result++;
			}
		}

		return result;
	}
}