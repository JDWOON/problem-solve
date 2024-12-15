package leetcode;

import java.util.Arrays;

public class Solution {
	public int countPrimes(int n) {
		int cnt = 0;
		boolean[] list = new boolean[n];
		Arrays.fill(list, true);
		
		for (int i = 2; i < n; i++) {
			if (list[i]) {
				for (int j = 2; j <= (n - 1) / i; j++) {
					list[i * j] = false;
				}
			}
		}
		
		for (int i = 2; i < n; i++) {
			if (list[i]) {
				cnt++;
			}
		}
		
		return cnt;
	}
}