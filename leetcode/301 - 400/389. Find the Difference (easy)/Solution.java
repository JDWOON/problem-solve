package leetcode;

// too slow
public class Solution {
    public char findTheDifference(String s, String t) {
		for(int i=0; i<s.length(); i++){
			t=t.replaceFirst(s.substring(i, i+1), "");
		}
		return t.charAt(0);
    }
}