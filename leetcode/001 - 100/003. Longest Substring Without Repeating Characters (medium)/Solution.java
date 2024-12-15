package leetcode;

import java.util.Arrays;

public class Solution {	
    public int lengthOfLongestSubstring(String s) {
    	int max=0;
    	boolean check[] = new boolean[256];
   
    	for(int i=0; i<s.length(); i++){
    		int cnt=0;
    		Arrays.fill(check, false);
    		for(int j=i; j<s.length(); j++){
    			int charInt = (int)s.charAt(j);
    			if(check[charInt]){
    				break;
    			}else{
    				check[charInt]=true;
    				cnt++;
    				if(cnt>max){
    					max=cnt;
    				}
    			}
    		}
    	}
        return max;
    }
}