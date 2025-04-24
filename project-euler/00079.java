package test;

public class TestMain {
	public static String[] KEYLOG = { "319", "680", "180", "690", "129", "620", "762", "689", "762", "318", "368",
			"710", "720", "710", "629", "168", "160", "689", "716", "731", "736", "729", "316", "729", "729", "710",
			"769", "290", "719", "680", "318", "389", "162", "289", "162", "718", "729", "319", "790", "680", "890",
			"362", "319", "760", "316", "729", "380", "319", "728", "716" };

	public static void main(String[] args) {
		for (int i = 790; i < 100000000; i++) {
			if (isPass(Integer.toString(i))) {
				System.out.println(i);
			}
		}
	}

	public static boolean isPass(String s) {
		for (int i = 0; i < KEYLOG.length; i++) {
			int idx = 0;
			for (int j = 0; j < s.length() && idx < 3; j++) {
				if (s.charAt(j) == KEYLOG[i].charAt(idx)) {
					idx++;
				}
			}

			if (idx < 3) {
				return false;
			}
		}

		return true;
	}
}
