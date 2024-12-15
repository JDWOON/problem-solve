package leetcode;

public class Solution {
	public int maxProfit(int[] prices) {
		int maxP = 0;
		for (int i = 0; i < prices.length - 1; i++) {
			while (i < prices.length - 1 && prices[i] >= prices[i + 1]) {
				i++;
			}
			for (int j = prices.length - 1; j > i; j--) {
				while (j > i && prices[j] <= prices[j - 1]) {
					j--;
				}
				if (prices[j] - prices[i] > maxP) {
					maxP = prices[j] - prices[i];
				}
			}
		}
		return maxP;
	}
}