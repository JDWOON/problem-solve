package test;

public class TestMain {
	public static void main(String[] args) {
		int result = 0, maxCnt = 0;

		for (int i = 3; i <= 1000; i++) {
			int cnt = getCnt(i);

			if (maxCnt < cnt) {
				result = i;
				maxCnt = cnt;
			}
		}

		System.out.println(result);
	}

	public static int getCnt(int p) {
		int cnt = 0;

		for (int i = 1; i < p; i++) {
			for (int j = i; i + j < p; j++) {
				if (i * i + j * j == (p - i - j) * (p - i - j)) {
					cnt++;
				}
			}
		}

		return cnt;
	}
}
