package test;

public class TestMain {
	public static void main(String[] args) {
		long max = 0;

		for (int i = 1; i < 10000; i++) {
			max = Math.max(getVal(i), max);
		}

		System.out.println(max);
	}

	public static long getVal(int n) {
		String s = "";

		for (int i = 1; s.length() < 9; i++) {
			String temp = Integer.toString(n * i);

			for (int j = 0; j < temp.length(); j++) {
				if (temp.charAt(j) == '0' || s.contains(temp.charAt(j) + "")) {
					return -1;
				}

				s += temp.charAt(j);
			}
		}

		return s.length() == 9 ? Long.parseLong(s) : -1;
	}
}
