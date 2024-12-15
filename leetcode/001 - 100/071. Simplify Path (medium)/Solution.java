package leetcode;

public class Solution {
	public String simplifyPath(String path) {
		String[] list = path.split("/");
		String[] p = new String[list.length];
		int len = 0;

		for (int i = 0; i < list.length; i++) {
			if (list[i].equals("..")) {
				if (len > 0) {
					len--;
				}
			} else if (list[i].equals(".") || list[i].isEmpty()) {
				continue;
			} else {
				p[len] = list[i];
				len++;
			}
		}

		String result = new String();

		for (int i = 0; i < len; i++) {
			result += "/" + p[i];
		}

		if (result.isEmpty()) {
			result = "/";
		}

		return result;
	}
}