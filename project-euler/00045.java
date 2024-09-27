package test;

public class TestMain {

	public static void main(String[] args) {
		System.out.println(solve());
	}

	public static long solve() {
		long a = 285, av = 1;
		long b = 165, bv = 1;
		long c = 143, cv = 1;

		while (true) {
			a++;
			av = a * (a + 1) / 2;

			while (bv < av) {
				b++;
				bv = b * (3 * b - 1) / 2;
			}

			while (cv < av) {
				c++;
				cv = c * (2 * c - 1);
			}

			if (av == bv && av == cv) {
				return av;
			}
		}
	}
}
