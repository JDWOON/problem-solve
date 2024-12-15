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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int len = 0;
        ListNode p = head;
        
        if(head==null){
            return head;
        }
        
        while(p!=null){
            len++;
            p = p.next;
        }
        
        if(len<=n){
            return head.next;
        }
        
        p = head;
        for(int i=0; i<len-n-1; i++){
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}