package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> letterCombinations(String digits) {
		List<String> p = new ArrayList<String>();

		if (digits.length() > 0) {
			p.add("");
		}

		for (int i = 0; i < digits.length(); i++) {
			List<String> temp = new ArrayList<String>();
			for (int j = 0; j < p.size(); j++) {
				switch (digits.charAt(i)) {
				case '2':
					temp.add(p.get(j) + "a");
					temp.add(p.get(j) + "b");
					temp.add(p.get(j) + "c");
					break;
				case '3':
					temp.add(p.get(j) + "d");
					temp.add(p.get(j) + "e");
					temp.add(p.get(j) + "f");
					break;
				case '4':
					temp.add(p.get(j) + "g");
					temp.add(p.get(j) + "h");
					temp.add(p.get(j) + "i");
					break;
				case '5':
					temp.add(p.get(j) + "j");
					temp.add(p.get(j) + "k");
					temp.add(p.get(j) + "l");
					break;
				case '6':
					temp.add(p.get(j) + "m");
					temp.add(p.get(j) + "n");
					temp.add(p.get(j) + "o");
					break;
				case '7':
					temp.add(p.get(j) + "p");
					temp.add(p.get(j) + "q");
					temp.add(p.get(j) + "r");
					temp.add(p.get(j) + "s");
					break;
				case '8':
					temp.add(p.get(j) + "t");
					temp.add(p.get(j) + "u");
					temp.add(p.get(j) + "v");
					break;
				case '9':
					temp.add(p.get(j) + "w");
					temp.add(p.get(j) + "x");
					temp.add(p.get(j) + "y");
					temp.add(p.get(j) + "z");
					break;
				case '0':
					temp.add(p.get(j) + " ");
					break;
				default:
					return null;
				}
			}
			p = temp;
		}
		return p;
	}
}