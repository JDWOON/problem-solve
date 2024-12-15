package leetcode;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode p = new ListNode(0);
        ListNode temp = p;
        while(l1 != null || l2 != null){
            if(l1 == null){
                temp.next = l2;
                l2= l2.next;
            }else if(l2 == null){
                temp.next = l1;
                l1= l1.next;
            }else if(l1.val<l2.val){
                temp.next = l1;
                l1= l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
            temp.next = null;
        }
        return p.next;
    }
}