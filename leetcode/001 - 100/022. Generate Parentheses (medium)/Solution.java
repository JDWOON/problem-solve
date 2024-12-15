package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> generateParenthesis(int n) {
		List<String> p = new ArrayList<String>();
		addOne(p, "", 0, 0, n);
		return p;
	}
	
	public void addOne(List<String> p, String str, int open, int close, int n){
		if(open==close && open==n){
			p.add(str);
			return;
		}
		if(open<n){
			addOne(p, str+"(", open+1, close, n);
		}
		if(open>close){
			addOne(p, str+")", open, close+1, n);
		}
	}
}