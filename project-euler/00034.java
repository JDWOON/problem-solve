package test;

public class TestMain {
	private static final int[] fact = new int[10];
	static {
		fact[0] = 1;

		for (int i = 1; i < fact.length; i++) {
			fact[i] = fact[i - 1] * i;
		}
	}

	public static void main(String[] args) {
		int sum = 0;

		for (int i = 10; i < 1000000; i++) {
			if (isMe(i)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	public static boolean isMe(int a) {
		int sum = 0;

		for (int i = 1; i <= a; i *= 10) {
			sum += fact[(a / i) % 10];
		}

		return a == sum;
	}
}
