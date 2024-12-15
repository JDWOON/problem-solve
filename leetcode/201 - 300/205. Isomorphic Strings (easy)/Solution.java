package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}

		HashMap<Character, Character> map = new HashMap<Character, Character>();
		List<Character> cList = new ArrayList<Character>();

		for (int i = 0; i < s.length(); i++) {
			if (map.get(s.charAt(i)) == null && cList.contains(t.charAt(i))) {
				return false;
			} else if (map.get(s.charAt(i)) == null) {
				map.put(s.charAt(i), t.charAt(i));
				cList.add(t.charAt(i));
			} else if (map.get(s.charAt(i)) != t.charAt(i)) {
				return false;
			}
		}
		return true;
	}
}