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
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if(root==null){
            return null;
        }else{
            temp=invertTree(root.right);
            root.right=invertTree(root.left);
            root.left=temp;
            return root;
        }
    }
}