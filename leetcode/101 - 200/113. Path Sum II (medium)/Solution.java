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
	public List<List<Integer>> pathSum(TreeNode root, int sum) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> list = new ArrayList<Integer>();

		pathCal(root, result, list, 0, sum);

		return result;
	}

	public void pathCal(TreeNode node, List<List<Integer>> result, List<Integer> list, int nowSum, int sum) {
		if (node == null) {
			return;
		}

		list.add(node.val);
		nowSum += node.val;

		if (nowSum == sum && node.left == null && node.right == null) {
			result.add(list);
		} else {
			if (node.left != null) {
				List<Integer> temp = new ArrayList<Integer>(list);
				pathCal(node.left, result, temp, nowSum, sum);
			}

			if (node.right != null) {
				List<Integer> temp = new ArrayList<Integer>(list);
				pathCal(node.right, result, temp, nowSum, sum);
			}
		}
	}
}
