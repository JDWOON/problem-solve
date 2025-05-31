package test;

public class TestMain {
	public static int SIZE = 50;

	public static void main(String[] args) {
		int result = 0;

		for (int x1 = 0; x1 <= SIZE; x1++) {
			for (int y1 = 0; y1 <= SIZE; y1++) {
				for (int x2 = 0; x2 <= SIZE; x2++) {
					for (int y2 = 0; y2 <= SIZE; y2++) {
						if (check(x1, y1, x2, y2)) {
							result++;
						}
					}
				}
			}
		}

		System.out.println(result / 2);
	}

	public static boolean check(int x1, int y1, int x2, int y2) {
		int a = x1 * x1 + y1 * y1;
		int b = x2 * x2 + y2 * y2;
		int c = (x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2);

		if (a == 0 || b == 0 || c == 0) {
			return false;
		}

		return a + b + c == Math.max(a, Math.max(b, c)) * 2;
	}
}
