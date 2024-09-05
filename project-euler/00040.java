package test;

public class TestMain {
	public static void main(String[] args) {

		int cnt = 0, idx = 1, result = 1;

		while (cnt <= 1000000) {
			String s = Integer.toString(idx);

			for (int i = 0; i < s.length(); i++) {
				cnt++;

				if (Integer.toString(cnt).matches("1[0]*")) {
					result *= (int) (s.charAt(i) - '0');
				}
			}

			idx++;
		}

		System.out.println(result);
	}
}
