package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> result = new ArrayList<String>();

		for (int i = 0; i < words.length; i++) {
			String s = new String();
			int end = i + 1;
			int len = words[i].length();
			int blank = maxWidth - words[i].length();

			while (end < words.length) {
				if (len + words[end].length() + 1 <= maxWidth) {
					len += words[end].length() + 1;
					blank -= words[end].length();
					end++;
				} else {
					break;
				}
			}

			for (int j = i; j < end; j++) {
				s += words[j];

				if (j < end - 1) {
					if (end < words.length) {
						for (int k = 0; k < blank / (end - i - 1); k++) {
							s += " ";
						}

						if (j - i < blank % (end - i - 1)) {
							s += " ";
						}
					} else {
						s += " ";
					}
				}
			}

			while (s.length() < maxWidth) {
				s += " ";
			}

			result.add(s);
			i = end - 1;
		}

		return result;
	}
}