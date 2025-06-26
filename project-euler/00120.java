package test;

public class TestMain {
	public static void main(String[] args) {
		int sum = 0;

		for (int a = 3; a <= 1000; a++) {
			sum += solve(a);
		}

		System.out.println(sum);
	}

	public static int solve(int a) {
		if (a % 2 == 0) {
			return a * (a - 2);
		} else {
			return a * (a - 1);
		}
	}
}