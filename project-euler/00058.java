package test;

public class TestMain {
	public static void main(String[] args) {
		long now = 1, total = 1, prime = 0;

		for (long i = 2; i < 100000; i += 2) {
			for (long j = 0; j < 4; j++) {
				now += i;

				total++;

				if (isPrime(now)) {
					prime++;
				}
			}

			if (total > prime * 10) {
				System.out.println(i + 1);
				break;
			}
		}
	}

	public static boolean isPrime(long n) {
		for (long i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
