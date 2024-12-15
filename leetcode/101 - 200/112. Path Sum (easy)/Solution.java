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
	public boolean hasPathSum(TreeNode root, int sum) {
		if (root == null) {
			return false;
		} else if (root.left == null && root.right == null) {
			if (root.val == sum) {
				return true;
			}
		} else if (root.left != null || root.right != null) {
			if (root.left != null) {
				root.left.val += root.val;
			}
			if (root.right != null) {
				root.right.val += root.val;
			}
			if (hasPathSum(root.left, sum) || hasPathSum(root.right, sum)) {
				return true;
			}
		}
		return false;
	}
}