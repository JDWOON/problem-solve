package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		ArrayList<Integer> now = new ArrayList<Integer>();

		Arrays.sort(candidates);

		getEachSum(candidates, target, 0, now, p);

		return p;
	}

	public void getEachSum(int[] candidates, int target, int cnt, ArrayList<Integer> now, List<List<Integer>> p) {
		if (target == 0) {
			// temp를 새로 생성해서 넣지 않으면 전부 빈 리스트가 입력됨
			ArrayList<Integer> temp = new ArrayList<Integer>(now);
			p.add(temp);
			return;
		}

		for (int i = cnt; i < candidates.length && candidates[i] <= target; i++) {
			now.add(candidates[i]);
			getEachSum(candidates, target - candidates[i], i, now, p);
			now.remove(now.size() - 1);
		}
	}
}