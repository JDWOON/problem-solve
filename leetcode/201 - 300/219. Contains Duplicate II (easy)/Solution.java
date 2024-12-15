package leetcode;

import java.util.HashMap;

public class Solution {
	public boolean containsNearbyDuplicate(int[] nums, int k) {

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {

			if (map.get(nums[i]) != null && (i - map.get(nums[i])) <= k) {
				return true;
			} else {
				map.put(nums[i], i);
			}
		}

		return false;
	}
}