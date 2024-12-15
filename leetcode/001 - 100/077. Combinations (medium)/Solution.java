package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		if (k == 0) {
			p.add(new ArrayList<Integer>());
			return p;
		} else if (n == 0) {
			return p;
		} else {
			p = combine(n - 1, k);
			List<List<Integer>> temp = combine(n - 1, k - 1);
			for (int i = 0; i < temp.size(); i++) {
				temp.get(i).add(n);
				p.add(temp.get(i));
			}
		}

		return p;
	}
}