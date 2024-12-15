package leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> p = new ArrayList<List<String>>();
		HashMap<Long, ArrayList<String>> map = new HashMap<Long, ArrayList<String>>();
		for (int i = 0; i < strs.length; i++) {
			long strVal = getVal(strs[i]);
			if (map.containsKey(strVal)) {
				map.get(strVal).add(strs[i]);
			} else {
				ArrayList<String> newGroup = new ArrayList<String>();
				newGroup.add(strs[i]);
				map.put(strVal, newGroup);
			}
		}

		p.addAll(map.values());

		return p;
	}

	public long getVal(String s) {
		long strVal = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch (ch) {
				case 'a':
					strVal *= 2;
					break;
				case 'b':
					strVal *= 3;
					break;
				case 'c':
					strVal *= 5;
					break;
				case 'd':
					strVal *= 7;
					break;
				case 'e':
					strVal *= 11;
					break;
				case 'f':
					strVal *= 13;
					break;
				case 'g':
					strVal *= 17;
					break;
				case 'h':
					strVal *= 19;
					break;
				case 'i':
					strVal *= 23;
					break;
				case 'j':
					strVal *= 29;
					break;
				case 'k':
					strVal *= 31;
					break;
				case 'l':
					strVal *= 37;
					break;
				case 'm':
					strVal *= 41;
					break;
				case 'n':
					strVal *= 43;
					break;
				case 'o':
					strVal *= 47;
					break;
				case 'p':
					strVal *= 53;
					break;
				case 'q':
					strVal *= 59;
					break;
				case 'r':
					strVal *= 61;
					break;
				case 's':
					strVal *= 67;
					break;
				case 't':
					strVal *= 71;
					break;
				case 'u':
					strVal *= 73;
					break;
				case 'v':
					strVal *= 79;
					break;
				case 'w':
					strVal *= 83;
					break;
				case 'x':
					strVal *= 89;
					break;
				case 'y':
					strVal *= 97;
					break;
				case 'z':
					strVal *= 101;
					break;
			}
		}
		return strVal;
	}
}