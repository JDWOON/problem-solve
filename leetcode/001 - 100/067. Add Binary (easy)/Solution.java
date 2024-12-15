package leetcode;

public class Solution {
	public String addBinary(String a, String b) {
		int i = a.length() - 1, j = b.length() - 1;
		String p = new String();
		boolean up = false;
		while (i >= 0 || j >= 0) {
			int cnt = 0;
			if (i >= 0 && a.charAt(i) == '1') {
				cnt++;
			}
			if (j >= 0 && b.charAt(j) == '1') {
				cnt++;
			}
			if (up) {
				cnt++;
			}
			if (cnt % 2 == 1) {
				p = "1" + p;
			} else {
				p = "0" + p;
			}
			up = false;

			if (cnt >= 2) {
				up = true;
			}
			i--;
			j--;
		}
		if (up) {
			p = "1" + p;
		}
		return p;
	}
}