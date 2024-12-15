package leetcode;

import java.util.List;

public class Solution {
	public int minimumTotal(List<List<Integer>> triangle) {
		for (int i = 1; i < triangle.size(); i++) {
			int fin = triangle.get(i).size() - 1;
			triangle.get(i).set(0, triangle.get(i).get(0) + triangle.get(i - 1).get(0));
			triangle.get(i).set(fin, triangle.get(i).get(fin) + triangle.get(i - 1).get(fin - 1));
			for (int j = 1; j < triangle.get(i).size() - 1; j++) {
				int k = triangle.get(i).get(j);
				triangle.get(i).set(j, Math.min(k + triangle.get(i - 1).get(j - 1), k + triangle.get(i - 1).get(j)));
			}
		}
		
		List<Integer> temp = triangle.get(triangle.size() - 1);
		int p = Integer.MAX_VALUE;
		for (int i = 0; i < temp.size(); i++) {
			if (p > temp.get(i)) {
				p = temp.get(i);
			}
		}
		return p;
	}
}