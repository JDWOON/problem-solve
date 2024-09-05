package test;

public class TestMain {
	public static void main(String[] args) {
		int a = 1, b = 1;

		for (int i = 10; i <= 99; i++) {
			for (int j = i + 1; j <= 99; j++) {
				if (isFun(i, j)) {
					a *= i;
					b *= j;
				}
			}
		}

		System.out.println(solve(a, b));
	}

	public static boolean isFun(int a, int b) {
		return a % 10 == b / 10 && a * (b % 10) == (a / 10) * b;
	}

	public static int solve(int a, int b) {
		for (int i = 2; i <= a; i++) {
			while (a % i == 0 && b % i == 0) {
				a /= i;
				b /= i;
			}
		}

		return b;
	}
}
