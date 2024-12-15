package leetcode;

public class Solution {
    public int trap(int[] height) {
        return part(height, 0, height.length-1);
    }
    
	public static int part(int[] height, int x, int y) {
		int p = 0, max1 = -1, max2 = -1;
		if (Math.abs(x - y) < 2) {
			return 0;
		} else {
			for (int i = x; i < y + 1; i++) {
				if (max1 == -1) {
					max1 = i;
				} else if (height[i] > height[max1]) {
					max2 = max1;
					max1 = i;
				} else if (max2 == -1) {
					max2 = i;
				} else if (height[i] > height[max2]) {
					max2 = i;
				}
			}
			if (max1 > max2) {
				int temp = max1;
				max1 = max2;
				max2 = temp;
			}
			for (int i = max1 + 1; i < max2; i++) {
				p += Math.min(height[max1], height[max2]) - height[i];
			}
			return p + part(height, x, max1) + part(height, max2, y);
		}
	}
}