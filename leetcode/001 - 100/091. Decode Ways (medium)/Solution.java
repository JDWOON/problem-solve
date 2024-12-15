package leetcode;

//too slow

public class Solution {
	public int numDecodings(String s) {
		if (s.length() <= 0) {
			return 0;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				if (i == 0 || s.charAt(i - 1) >= '3' || s.charAt(i - 1) == '0') {
					return 0;
				}
			}
		}
		return cntNum(s, 0);
	}

	public int cntNum(String s, int pos) {
		if (s.length() == pos) {
			return 1;
		} else if (s.length() < pos || s.charAt(pos) == '0') {
			return 0;
		} else if (s.length() == pos + 1) {
			return 1;
		} else if (s.charAt(pos) == '1') {
			if (s.charAt(pos) >= '3') {
				return cntNum(s, pos + 1) * 2;
			} else if (s.charAt(pos) == '0') {
				return cntNum(s, pos + 2);
			} else {
				return cntNum(s, pos + 1) + cntNum(s, pos + 2);
			}
		} else if (s.charAt(pos) == '2') {
			if (s.charAt(pos + 1) >= '7') {
				return cntNum(s, pos + 1);
			} else if (s.charAt(pos + 1) >= '3') {
				return cntNum(s, pos + 2) * 2;
			} else if (s.charAt(pos + 1) == '0') {
				return cntNum(s, pos + 2);
			} else {
				return cntNum(s, pos + 1) + cntNum(s, pos + 2);
			}
		} else {
			return cntNum(s, pos + 1);
		}
	}
}