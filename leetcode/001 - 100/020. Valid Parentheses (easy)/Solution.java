package leetcode;

public class Solution {
	public boolean isValid(String s) {
		char[] st = new char[s.length()];
		int stIndex = 0;

		for (int i = 0; i < s.length(); i++) {
			char temp = s.charAt(i);
			if (temp == '(' || temp == '{' || temp == '[') {
				st[stIndex] = temp;
				stIndex++;
			} else if (stIndex > 0) {
				if ((st[stIndex - 1] == '(' && temp == ')') ||
					(st[stIndex - 1] == '{' && temp == '}') ||
					(st[stIndex - 1] == '[' && temp == ']')) {
					stIndex--;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}

		if (stIndex == 0) {
			return true;
		} else {
			return false;
		}
	}
}