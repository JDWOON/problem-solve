package leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {
	public String largestNumber(int[] nums) {
		String[] s = new String[nums.length];

		for (int i = 0; i < nums.length; i++) {
			s[i] = Integer.toString(nums[i]);
		}

		Arrays.sort(s, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return (s2 + s1).compareTo(s1 + s2);
			}
		});

		String p = new String();

		for (String str : s) {
			p += str;
		}

		while (p.length() > 1 && p.charAt(0) == '0') {
			p = p.substring(1);
		}

		return p;
	}
}