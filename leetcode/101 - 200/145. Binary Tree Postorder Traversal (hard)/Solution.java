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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> p = new ArrayList<Integer>();
        if(root==null){
            return p;
        }
        if(root.left!=null){
            p.addAll(postorderTraversal(root.left));
        }
        if(root.right!=null){
            p.addAll(postorderTraversal(root.right));
        }
        p.add(root.val);
        return p;
    }
}