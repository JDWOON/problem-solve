package leetcode;

import java.util.Stack;

public class Solution {
	public int longestValidParentheses(String s) {
		Stack<Integer> stack = new Stack<Integer>();
		int max = 0;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push(i + 1);
			} else {
				if (stack.empty() || stack.peek() < 0) {
					stack.push(-i - 1);
				} else {
					stack.pop();
					int len = 0;

					if (stack.empty()) {
						len = i + 1;
					} else {
						len = i + 1 - Math.abs(stack.peek());
					}

					max = Math.max(max, len);
				}
			}
		}

		return max;
	}
}