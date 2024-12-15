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
	public ListNode swapPairs(ListNode head) {
		ListNode temp = head;

		if (head == null || head.next == null) {
			return head;
		} else {
			temp = head.next;
			head.next = temp.next;
			temp.next = head;
			head = temp;
			temp = temp.next;
		}

		while (temp.next != null && temp.next.next != null) {
			ListNode nodeA = temp.next;
			ListNode nodeB = nodeA.next;
			nodeA.next = nodeB.next;
			nodeB.next = nodeA;
			temp.next = nodeB;
			temp = temp.next.next;
		}

		return head;
	}
}