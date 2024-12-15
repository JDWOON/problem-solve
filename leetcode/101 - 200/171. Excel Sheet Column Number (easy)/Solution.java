package leetcode;

public class Solution {
    public int titleToNumber(String s) {
        int front = 0;
		int back = 0;
		for (int i = 0; i < s.length() - 1; i++) {
			front = front * 26 + 26;
		}
		for (int i = 0; i < s.length(); i++) {
			int temp = (int) s.charAt(i) - 65;
			back = back * 26 + temp;
		}

		return front + back + 1;
	}
}