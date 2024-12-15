package leetcode;

public class Solution {
    public int countNumbersWithUniqueDigits(int n) {
		int result = 0;
		for (int i = 0; i < n + 1; i++) {
			int temp = 9;
			if (i == 0) {
				result += 1;
			} else if (i == 1) {
				result += 9;
			} else {
				for (int j = 2; j < i + 1; j++) {
					temp = temp * (11 - j);
				}
				result += temp;
			}

		}
		return result;
    }
}