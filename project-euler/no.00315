public class TestMain {

	public static int[][] tran = { { 0, 4, 3, 3, 4, 3, 2, 2, 1, 2, 6 }, { 4, 0, 5, 3, 2, 5, 6, 2, 5, 4, 2 },
			{ 3, 5, 0, 2, 5, 4, 3, 5, 2, 3, 5 }, { 3, 3, 2, 0, 3, 2, 3, 3, 2, 1, 5 },
			{ 4, 2, 5, 3, 0, 3, 4, 2, 3, 2, 4 }, { 3, 5, 4, 2, 3, 0, 1, 3, 2, 1, 5 },
			{ 2, 6, 3, 3, 4, 1, 0, 4, 1, 2, 6 }, { 2, 2, 5, 3, 2, 3, 4, 0, 3, 2, 4 },
			{ 1, 5, 2, 2, 3, 2, 1, 3, 0, 1, 7 }, { 2, 4, 3, 1, 2, 1, 2, 2, 1, 0, 6 },
			{ 6, 2, 5, 5, 4, 5, 6, 4, 7, 6, 0 } };

	public static void main(String[] args) {
//		System.out.println(solveSam(137));
//		System.out.println(solveMax(137));

		long samp = 0;
		long maxp = 0;

		for (int i = 10000000; i < 20000000; i++) {
			if (isPrime(i)) {
				samp += solveSam(i);
				maxp += solveMax(i);
			}
		}

		System.out.println(samp);
		System.out.println(maxp);
		System.out.println(samp - maxp);
	}

	public static long solveSam(int n) {
		long result = samCal(0, n);

		while (n >= 10) {
			int now = n;
			n = next(n);
			result += samCal(now, n);
		}

		return result + samCal(n, 0);
	}

	public static long solveMax(int n) {
		long result = maxCal(0, n);

		while (n > 10) {
			int now = n;
			n = next(n);
			result += maxCal(now, n);
		}

		return result + maxCal(n, 0);
	}

	public static int next(int n) {
		int result = 0;

		while (n > 0) {
			result += n % 10;
			n /= 10;
		}

		return result;
	}

	public static long samCal(int a, int b) {
		long result = 0;
//		System.out.print(a + " -> " + b + " : " );
		while (a > 0 || b > 0) {
			int ca = a > 0 ? a % 10 : 10;
			int cb = b > 0 ? b % 10 : 10;

			result += tran[ca][10] + tran[10][cb];

			a /= 10;
			b /= 10;
		}
//		System.out.println(result);
		return result;
	}

	public static long maxCal(int a, int b) {
		long result = 0;
//		System.out.print(a + " -> " + b + " : " );
		while (a > 0 || b > 0) {
			int ca = a > 0 ? a % 10 : 10;
			int cb = b > 0 ? b % 10 : 10;

			result += tran[ca][cb];

			a /= 10;
			b /= 10;
		}
//		System.out.println(result);
		return result;
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
