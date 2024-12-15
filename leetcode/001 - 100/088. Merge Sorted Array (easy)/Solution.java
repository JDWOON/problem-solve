package leetcode;

public class Solution {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int[] p = new int[m + n];
		int a = 0, b = 0;
		for (int i = 0; i < m + n; i++) {
			if (a >= m) {
				p[i] = nums2[b];
				b++;
			} else if (b >= n) {
				p[i] = nums1[a];
				a++;
			} else if (nums1[a] < nums2[b]) {
				p[i] = nums1[a];
				a++;
			} else {
				p[i] = nums2[b];
				b++;
			}
		}
		for (int i = 0; i < m + n; i++) {
			nums1[i] = p[i];
		}
	}
}