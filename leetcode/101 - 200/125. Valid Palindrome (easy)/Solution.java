package leetcode;

public class Solution {
	public boolean isPalindrome(String s) {
		int a = 0, b = s.length() - 1;

		while (a < b) {
			while (a < s.length() && !((s.charAt(a) >= 'a' && s.charAt(a) <= 'z')
					|| (s.charAt(a) >= 'A' && s.charAt(a) <= 'Z') || (s.charAt(a) >= '0' && s.charAt(a) <= '9'))) {
				a++;
			}
			while (b > -1 && !((s.charAt(b) >= 'a' && s.charAt(b) <= 'z') || (s.charAt(b) >= 'A' && s.charAt(b) <= 'Z')
					|| (s.charAt(b) >= '0' && s.charAt(b) <= '9'))) {
				b--;
			}

			if (a >= b) {
				break;
			} else if (a < b && Character.toLowerCase(s.charAt(a)) == Character.toLowerCase(s.charAt(b))) {
				a++;
				b--;
			} else {
				return false;
			}
		}
		return true;
	}
}