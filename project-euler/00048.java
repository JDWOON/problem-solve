package test;

public class TestMain {
	public static long MOD = 10000000000L;

	public static void main(String[] args) {
		long sum = 0;

		for (long i = 1; i <= 1000; i++) {
			long now = 1;

			for (long j = 0; j < i; j++) {
				now = (now * i) % MOD;

				if (now == 0) {
					break;
				}
			}

			sum = (sum + now) % MOD;
		}

		System.out.println(sum);
	}
}
