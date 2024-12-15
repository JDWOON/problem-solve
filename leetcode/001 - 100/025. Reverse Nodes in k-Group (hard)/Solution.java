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
	public ListNode reverseKGroup(ListNode head, int k) {
		int len = 0;
		for (ListNode i = head; i != null; i = i.next) {
			len++;
		}

		ListNode p = new ListNode(0);
		ListNode tail = head;
		p.next = head;
		head = p;
		while (len >= k) {
			for (int i = 1; i < k; i++) {
				ListNode temp = tail.next.next;
				tail.next.next = head.next;
				head.next = tail.next;
				tail.next = temp;
			}
			head = tail;
			tail = tail.next;

			len = len - k;
		}
		return p.next;
	}
}