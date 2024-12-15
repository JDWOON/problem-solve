package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public String getPermutation(int n, int k) {
		String result = new String();
		List<Integer> list = new ArrayList<Integer>();
		int p = 1;

		for (int i = 1; i <= n; i++) {
			p *= i;
			list.add(i);
		}

		k--;

		for (int i = n; i > 0; i--) {
			p /= i;
			result += list.get(k / p);
			list.remove(k / p);
			k %= p;
		}

		return result;
	}
}