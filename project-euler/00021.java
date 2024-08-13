package test;

public class TestMain {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 2; i <= 10000; i++) {
			int cal = d(i);

			if (i != cal && i == d(cal)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	public static int d(int n) {
		int result = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				result += i;
			}
		}

		return result;
	}
}
