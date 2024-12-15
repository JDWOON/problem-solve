package leetcode;

public class Solution {
    public String toHex(int num) {
		int[] cal = new int[8];
		boolean isMinus = false;
		if (num == 0) {
			return "0";
		} else if (num < 0) {
			isMinus = true;
			num = -1 - num;
		}
		for (int i = 7; i >= 0; i--) {
			if (isMinus) {
				cal[i] = 15 - num % 16;
			} else {
				cal[i] = num % 16;
			}
			num = num / 16;
		}
		String p = new String();
		int k = 0;
		while (cal[k] == 0)
			k++;

		for (; k < 8; k++) {
			if (cal[k] > 9) {
				p += (char) (cal[k] + 87);
			} else {
				p += (char) (cal[k] + 48);
			}
		}
		return p;
	}
}