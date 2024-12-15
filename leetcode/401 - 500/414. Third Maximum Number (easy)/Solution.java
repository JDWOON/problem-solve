package leetcode;

public class Solution {
	public int thirdMax(int[] nums) {
		int a, b, c, k = 0;
		boolean min = false;
		a = b = c = Integer.MIN_VALUE;

		for (int num : nums) {
			if (num == Integer.MIN_VALUE) {
				if (!min) {
					min = true;
					k++;
				}
				continue;
			} else if (num == a || num == b || num == c) {
				continue;
			} else if (num > a) {
				c = b;
				b = a;
				a = num;
			} else if (num > b) {
				c = b;
				b = num;
			} else if (num > c) {
				c = num;
			}
			k++;
		}

		if (k < 3) {
			return a;
		} else {
			return c;
		}
	}
}