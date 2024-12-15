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
    public ListNode reverseList(ListNode head) {
        ListNode temp1=null, temp2;
        if(head==null){
            return head;
        }
        while(head.next!=null){
            temp2=head.next;
            head.next=temp1;
            temp1=head;
            head=temp2;
        }
        head.next=temp1;
        return head;
    }
}