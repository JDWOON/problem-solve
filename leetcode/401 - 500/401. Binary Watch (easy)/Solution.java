package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> readBinaryWatch(int num) {
		List<String> p = new ArrayList<String>();
		for (int i = 0; i < 12; i++) {
			int a = 0;
			for (int k = i; k > 0; k = k / 2) {
				a += k % 2;
			}
			for (int j = 0; j < 60; j++) {
				int b = 0;
				for (int k = j; k > 0; k = k / 2) {
					b += k % 2;
				}
				if (a + b == num) {
					if (j < 10) {
						p.add(i + ":0" + j);
					} else {
						p.add(i + ":" + j);
					}
				}
			}
		}
		return p;
	}
}