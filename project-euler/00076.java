package test;

public class TestMain {
	public static void main(String[] args) {
		System.out.println(solve(99, 100));
	}

	public static int solve(int max, int rest) {
		if (rest == 0) {
			return 1;
		} else if (max > rest) {
			return solve(max - 1, rest);
		} else if (max == 1) {
			return 1;
		} else {
			return solve(max, rest - max) + solve(max - 1, rest);
		}
	}
}
