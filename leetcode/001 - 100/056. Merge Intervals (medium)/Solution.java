package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */

public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
		List<Interval> result = new ArrayList<Interval>();
		int len = intervals.size();

		for (int i = 0; i < len; i++) {
			int min = Integer.MAX_VALUE, k = 0;

			for (int j = 0; j < intervals.size(); j++) {
				if (intervals.get(j).start <= min) {
					min = intervals.get(j).start;
					k = j;
				}
			}

			if (result.size() == 0) {
				result.add(intervals.get(k));
			} else if (min <= result.get(result.size() - 1).end) {
				result.get(result.size() - 1).start = Math.min(result.get(result.size() - 1).start, min);
				result.get(result.size() - 1).end = Math.max(result.get(result.size() - 1).end, intervals.get(k).end);
			} else {
				result.add(intervals.get(k));
			}
			
			intervals.remove(k);
		}

		return result;
    }
}