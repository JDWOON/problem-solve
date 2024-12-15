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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }else if(p==null && q!=null){
            return false;
        }else if(p!=null && q==null){
            return false;
        }else if(p.left==null && p.right==null && q.left==null && q.right==null && p.val==q.val){
            return true;
        }else if(isSameTree(p.left, q.left) && isSameTree(p.right, q.right) && p.val==q.val){
            return true;
        }else{
            return false;
        }
    }
}