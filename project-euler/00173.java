package test;

public class TestMain {
	public static final long max = 1000000;

	public static void main(String[] args) {
		long result = 0;

		for (long i = 3; i < 1000000; i++) {
			if (4 * i - 4 > max) {
				break;
			}

			for (long j = 1; j * 2 < i; j++) {
				if (4 * j * (i - j) <= max) {
					result++;
				}
			}
		}

		System.out.println(result);
	}
}
