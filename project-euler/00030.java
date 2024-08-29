package test;

public class TestMain {
	public static void main(String[] args) {
		int sum = 0;
		
		for (int i = 2; i < 1000000; i++) {
			if (i == getVal(i)) {
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

	public static int getVal(int a) {
		int sum = 0;

		while (a > 0) {
			int temp = a % 10;

			sum += (int) Math.pow(temp, 5);

			a /= 10;
		}

		return sum;
	}
}
