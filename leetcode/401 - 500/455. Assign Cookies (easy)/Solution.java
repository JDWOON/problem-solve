package leetcode;

import java.util.Arrays;

// slow
public class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int cnt = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        
        for(int i=0; i<g.length; i++){
        	for(int j=0; j<s.length; j++){
        		if(g[i] <= s[j]){
        			s[j] = -1;
        			cnt++;
        			break;
        		}
        	}
        }
        return cnt;
    }
}