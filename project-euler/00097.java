package test;

public class TestMain {
	public static void main(String[] args) {
		long result = 28433;

		for (int i = 0; i < 7830457; i++) {
			result *= 2;
			result %= 10000000000L;
		}

		result++;

		System.out.println(result);
	}

}
