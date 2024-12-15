package leetcode;

// use k-map, find bit cal
public class Solution {
	public int singleNumber(int[] nums) {
		int a = 0, b = 0;
		for (int num : nums) {
			int nextA, nextB;
			nextA = (a & ~num) | (~b & num);
			nextB = a & ((~b & num) | (b & ~num));
			a = nextA;
			b = nextB;
		}
		return a;
	}
}