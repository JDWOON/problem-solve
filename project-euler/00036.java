package test;

public class TestMain {
	public static void main(String[] args) {
		int sum = 0;

		for (int i = 1; i < 1000000; i++) {
			if (isPal(i)) {
				sum += i;
			}
		}

		System.out.println(sum);
	}

	public static boolean isPal(int n) {
		String s = Integer.toString(n);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
				return false;
			}
		}

		String bs = Integer.toBinaryString(n);

		for (int i = 0; i < bs.length(); i++) {
			if (bs.charAt(i) != bs.charAt(bs.length() - 1 - i)) {
				return false;
			}
		}

		return true;
	}
}
