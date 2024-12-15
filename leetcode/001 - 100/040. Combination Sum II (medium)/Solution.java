package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		ArrayList<Integer> now = new ArrayList<Integer>();

		Arrays.sort(candidates);

		getEachSet(candidates, target, 0, now, p);

		return p;
	}

	public void getEachSet(int[] candidates, int target, int cnt, ArrayList<Integer> now, List<List<Integer>> p) {
		if (target == 0) {
			ArrayList<Integer> temp = new ArrayList<Integer>(now);
			p.add(temp);
			return;
		}

		for (int i = cnt; i < candidates.length && candidates[i] <= target; i++) {
			int j = i;
			while (j < candidates.length && candidates[i] == candidates[j]) {
				j++;
			}

			for (int k = 1; k <= j - i && target >= k * candidates[i]; k++) {
				now.add(candidates[i]);
				getEachSet(candidates, target - k * candidates[i], j, now, p);
			}

			for (int k = 1; k <= j - i && target >= k * candidates[i]; k++) {
				now.remove(now.size() - 1);
			}

			i = j - 1;
		}
	}
}