package leetcode;

import java.util.ArrayList;
import java.util.List;

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
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> result = new ArrayList<Integer>();
		trav(root, result);
		return result;
	}

	public void trav(TreeNode root, List<Integer> result) {
		if (root == null) {
			return;
		} else if (root.left != null) {
			trav(root.left, result);
		}

		result.add(root.val);

		if (root.right != null) {
			trav(root.right, result);
		}
	}
}