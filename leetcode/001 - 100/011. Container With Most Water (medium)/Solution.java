package leetcode;

public class Solution {
	public int maxArea(int[] height) {
		int p = 0;
		int i = 0, j = height.length - 1;
		while (i < j) {
			int temp = 0;
			if (height[i] > height[j]) {
				temp = (j - i) * height[j];
				j--;
			} else {
				temp = (j - i) * height[i];
				i++;
			}
			if (temp > p) {
				p = temp;
			}
		}
		return p;
	}
}