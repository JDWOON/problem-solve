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
	public ListNode rotateRight(ListNode head, int k) {
		ListNode p = head;
		int len = 1;
		if (head == null) {
			return null;
		}
		while (p.next != null) {
			p = p.next;
			len++;
		}
		k = k % len;
		p.next = head;
		p = head;
		for (int i = 0; i < len - k - 1; i++) {
			p = p.next;
		}
		head = p.next;
		p.next = null;
		return head;
	}
}