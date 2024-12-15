package leetcode;

public class Solution {
    public String addStrings(String num1, String num2) {
 		String p = new String();
		int a = num1.length(), b = num2.length();
		int up = 0;
		for (int i = 1; i <= a || i <= b; i++) {
			int x, y;
			if (i > a) {
				x = 0;
			} else {
				x = (int) num1.charAt(a - i) - 48;
			}
			if (i > b) {
				y = 0;
			} else {
				y = (int) num2.charAt(b - i) - 48;
			}
			x = x + y + up;
			p = (char) (x % 10 + 48) + p;
			if(x>9){
				up=1;
			}else{
				up=0;
			}
		}
		if(up==1){
			p="1"+p;
		}
		return p;
    }
}