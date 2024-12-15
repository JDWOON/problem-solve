package leetcode;

import java.util.Arrays;

public class Solution {
	public String multiply(String num1, String num2) {
		int[] p = new int[num1.length() + num2.length()];
		Arrays.fill(p, 0);

		for (int i = 0; i < num1.length(); i++) {
			for (int j = 0; j < num2.length(); j++) {
				p[i + j + 1] += (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
			}
		}

		for (int i = p.length - 1; i > 0; i--) {
			if (p[i] >= 10) {
				p[i - 1] += p[i] / 10;
				p[i] %= 10;
			}
		}

		String result = new String();

		for (int i = 0; i < p.length; i++) {
			if (p[i] != 0 || result.length() != 0) {
				result += (char) ('0' + p[i]);
			}
		}

		if (result.length() == 0) {
			return "0";
		}

		return result;
	}
}