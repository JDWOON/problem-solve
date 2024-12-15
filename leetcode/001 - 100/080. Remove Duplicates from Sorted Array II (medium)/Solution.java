public class Solution {
	public int removeDuplicates(int[] nums) {
		int result = 0, idx = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i < 2 || nums[i] != nums[idx - 2]) {
				result++;
				nums[idx] = nums[i];
				idx++;
			}
		}

		return result;
	}
}
