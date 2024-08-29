package test;

public class TestMain {
	public static void main(String[] args) {
		int sum = 1;

		for (int i = 3; i <= 1001; i += 2) {
			int now = i * i;

			for (int j = 0; j < 4; j++) {
				sum += now - j * (i - 1);
			}
		}

		System.out.println(sum);
	}
}
