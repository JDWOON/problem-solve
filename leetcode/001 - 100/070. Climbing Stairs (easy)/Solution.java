package leetcode;

public class Solution {
    public int climbStairs(int n) {
    	int a=0, b=1;
    	for(int i=0; i<n+1; i++){
    		a+=b;
    		b=a-b;
    	}
    	return a;
    }
}