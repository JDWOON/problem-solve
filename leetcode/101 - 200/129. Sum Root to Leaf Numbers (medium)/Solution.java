package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

public class Solution {
	public int sumNumbers(TreeNode root) {
		if (root == null) {
			return 0;
		} else {
			return getSum(root, 0);
		}
	}

	public int getSum(TreeNode root, int val) {
		int thisVal = val * 10 + root.val;
		if (root.left == null && root.right == null) {
			return thisVal;
		} else if (root.left == null) {
			return getSum(root.right, thisVal);
		} else if (root.right == null) {
			return getSum(root.left, thisVal);
		} else {
			return getSum(root.left, thisVal) + getSum(root.right, thisVal);
		}
	}
}