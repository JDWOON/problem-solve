package leetcode;

public class Solution {
    public int trailingZeroes(int n) {
    	int p=0;
    	while(n!=0){
    	    n/=5;
    	    p+=n;
    	}
    	return p;
    }
}