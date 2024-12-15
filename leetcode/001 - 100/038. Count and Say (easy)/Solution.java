package leetcode;

public class Solution {
	public String countAndSay(int n) {
		if (n < 1) {
			return "";
		} else if (n == 1) {
			return "1";
		} else {
			String p = new String();
			String prev = countAndSay(n - 1);
			for (int i = 0; i < prev.length(); i++) {
				char temp = prev.charAt(i);
				int j = 1;
				while (i < prev.length() - 1 && temp == prev.charAt(i + 1)) {
					i++;
					j++;
				}
				p = p + j + temp;
			}
			return p;
		}
	}
}