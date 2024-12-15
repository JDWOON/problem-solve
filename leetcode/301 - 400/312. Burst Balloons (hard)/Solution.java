package leetcode;

public class Solution {
    public int maxCoins(int[] nums) {
		int[] list = new int[nums.length + 2]; // �迭 ���ʿ� 1�� �߰��� �迭
		list[0] = 1;
		list[list.length - 1] = 1;
		for (int i = 0; i < nums.length; i++) {
			list[i + 1] = nums[i];
		}

		// p[i][j] = nums�� i��°~k��° ���Ҹ��� �迭�� ���� �� max���� ��
		int[][] p = new int[list.length][list.length];
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				p[i][j] = 0;
			}
		}

		// end(������ ��), start(���� ��), last(���� �������� ��Ʈ���� ��ġ)
		for (int end = 1; end < list.length - 1; end++) {
			for (int start = end; start >= 1; start--) {
				for (int last = start; last <= end; last++) {
					p[start][end] = Math.max(list[start - 1] * list[last] * list[end + 1] + p[start][last-1] + p[last+1][end], p[start][end]);
				}
			}
		}
		
		return p[1][nums.length];
    }
}