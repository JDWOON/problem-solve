package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

public class Solution {
	public ListNode mergeKLists(ListNode[] lists) {
		List<Integer> a = new ArrayList<Integer>();

		// O(n)
		for (int i = 0; i < lists.length; i++) {
			while (lists[i] != null) {
				a.add(lists[i].val);
				lists[i] = lists[i].next;
			}
		}

		if (a.size() > 0) {
			// O(n)
			int[] b = new int[a.size()];

			for (int i = 0; i < a.size(); i++) {
				b[i] = a.get(i);
			}

			// O(n * log n)
			Arrays.sort(b);

			ListNode head = new ListNode(b[0]);
			ListNode tail = head;

			// O(n)
			for (int i = 1; i < b.length; i++) {
				tail.next = new ListNode(b[i]);
				tail = tail.next;
			}

			return head;
		} else {
			return null;
		}
	}
}