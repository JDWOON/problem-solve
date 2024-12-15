package p2_AddTwoNumbers;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp1 = new ListNode(0), p=temp1;
		int len = Math.max(nodelen(l1), nodelen(l2));
		int a, b, temp2, k = 0;

		for (int i = 0; i < len; i++) {
			if (l1 == null) {
				a = 0;
			} else {
				a = l1.val;
				l1 = l1.next;
			}
			if (l2 == null) {
				b = 0;
			} else {
				b = l2.val;
				l2 = l2.next;
			}
			temp2 = a + b + k;
			k = temp2 / 10;
			temp1.val = temp2%10;
			if(i<len-1){
			    temp1.next = new ListNode(0);
			    temp1=temp1.next;
			}else if(k>0){
			    temp1.next = new ListNode(1);
			    temp1=temp1.next;
			}
		}

		return p;
	}

	public static int nodelen(ListNode l) {
		int k = 0;
		while (l != null) {
			l = l.next;
			k++;
		}
		return k;
	}
}