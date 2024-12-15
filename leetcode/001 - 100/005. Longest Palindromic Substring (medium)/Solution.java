package leetcode;

public class Solution {
    public static String longestPalindrome(String s) {
    	int max=0, start=0, end=0;
    	for(int i=0; i<s.length(); i++){
    		//even
    		for(int j=0; i-j>-1 && i+j+1<s.length(); j++){
    			int left=i-j;
    			int right=i+j+1;
    			if(s.charAt(left) != s.charAt(right)){
    				break;
    			}else if(max<j*2+2){
    				max=j*2+2;
    				start=left;
    				end=right;
    			}
    		}
    		//odd
    		for(int j=1; i-j>-1 && i+j<s.length(); j++){
    			int left=i-j;
    			int right=i+j;
    			if(s.charAt(left) != s.charAt(right)){
    				break;
    			}else if(max<j*2+1){
    				max=j*2+1;
    				start=left;
    				end=right;
    			}
    		}
    	}
    	return s.substring(start, end+1);
    }
}