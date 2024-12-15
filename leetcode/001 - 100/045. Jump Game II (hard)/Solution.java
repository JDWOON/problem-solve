package leetcode;

public class Solution {
	public int jump(int[] nums) {
		int p = 0, idx = 0;

		while (idx < nums.length - 1) {
			if (nums[idx] + idx >= nums.length - 1) {
				p++;
				break;
			}

			int next = 0;
			for (int i = 1; i <= nums[idx]; i++) {
				if (nums[idx + i] + i > nums[idx + next] + next) {
					next = i;
				}
			}

			if (next == 0) { // 더이상 길이 없음
				return -1;
			}

			p++;
			idx += next;
		}

		return p;
	}
}