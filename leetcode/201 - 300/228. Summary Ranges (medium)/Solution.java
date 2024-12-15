package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> p = new ArrayList<String>();
		int a, b;
		for (int i = 0; i < nums.length; i++) {
			a = nums[i];
			b = i;
			while (b < nums.length - 1 && nums[b] + 1 == nums[b + 1]) {
				b++;
			}
			i = b;
			b = nums[b];
			if (a == b) {
				p.add(Integer.toString(b));
			} else {
				p.add(a + "->" + b);
			}
		}
		return p;
	}
}