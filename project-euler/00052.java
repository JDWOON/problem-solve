package test;

import java.util.Arrays;

public class TestMain {
	public static void main(String[] args) {
		for (int i = 1; i < 1000000; i++) {
			String s = sort(i);
			boolean check = true;

			for (int j = 2; check && j <= 6; j++) {
				if (!s.equals(sort(i * j))) {
					check = false;
				}
			}
			
			if(check) {
				System.out.println(i);
				break;
			}
		}
	}

	public static String sort(int n) {
		char[] ca = Integer.toString(n).toCharArray();
		Arrays.sort(ca);

		return new String(ca);
	}
}
