package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> restoreIpAddresses(String s) {
		List<String> p = new ArrayList<String>();
		String[] subIP = new String[4];

		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				for (int c = 1; c <= 3; c++) {
					for (int d = 1; d <= 3; d++) {
						if (a + b + c + d == s.length() && (a == 1 || s.charAt(0) != '0')
								&& (b == 1 || s.charAt(a) != '0') && (c == 1 || s.charAt(a + b) != '0')
								&& (d == 1 || s.charAt(a + b + c) != '0')) {
							subIP[0] = s.substring(0, a);
							subIP[1] = s.substring(a, a + b);
							subIP[2] = s.substring(a + b, a + b + c);
							subIP[3] = s.substring(a + b + c, a + b + c + d);
							if (Integer.parseInt(subIP[0]) < 256 && Integer.parseInt(subIP[1]) < 256
									&& Integer.parseInt(subIP[2]) < 256 && Integer.parseInt(subIP[3]) < 256) {
								p.add(subIP[0] + "." + subIP[1] + "." + subIP[2] + "." + subIP[3]);
							}
						}
					}
				}
			}
		}
		return p;
	}
}