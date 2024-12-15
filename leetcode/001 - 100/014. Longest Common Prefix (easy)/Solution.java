package leetcode;

public class Solution {
	public String longestCommonPrefix(String[] strs) {
		int commonLength = Integer.MAX_VALUE;

		if (strs.length < 1) {
			return "";
		} else if (strs.length == 1) {
			return strs[0];
		}

		for (int i = 0; i < strs.length - 1; i++) {
			int temp = 0;
			for (int j = 0; j < Math.min(strs[i].length(), strs[i + 1].length()); j++) {
				if (strs[i].charAt(j) == strs[i + 1].charAt(j)) {
					temp++;
				} else {
					break;
				}
			}
			if (temp < commonLength) {
				commonLength = temp;
			}
		}

		return strs[0].substring(0, commonLength);
	}
}