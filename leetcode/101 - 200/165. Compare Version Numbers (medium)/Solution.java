package leetcode;

public class Solution {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("[.]");
		String[] v2 = version2.split("[.]");

		if (!version1.contains(".")) {
			v1 = new String[1];
			v1[0] = version1;
		}

		if (!version2.contains(".")) {
			v2 = new String[1];
			v2[0] = version2;
		}

		for (int i = 0; i < Math.max(v1.length, v2.length); i++) {
			int a = 0, b = 0;

			if (i < v1.length) {
				a = Integer.parseInt(v1[i]);
			}
			if (i < v2.length) {
				b = Integer.parseInt(v2[i]);
			}

			if (a > b) {
				return 1;
			} else if (a < b) {
				return -1;
			}
		}

		return 0;
	}
}