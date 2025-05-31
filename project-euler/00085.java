package test;

public class TestMain {
	public static void main(String[] args) {
		int ix = 0, iy = 0;
		int min = Integer.MAX_VALUE;

		for (int x = 1; x < 2000; x++) {
			for (int y = 1; y < 2000; y++) {
				int temp = solve(x, y) - 2000000;

				if (min > Math.abs(temp)) {
					ix = x;
					iy = y;
					min = Math.abs(temp);
				}

				if (temp > 0) {
					break;
				}
			}
		}

		System.out.println(ix * iy);
	}

	public static int solve(int x, int y) {
		return x * (x + 1) * y * (y + 1) / 4;
	}
}
