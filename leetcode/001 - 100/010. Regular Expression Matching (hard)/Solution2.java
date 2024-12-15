package leetcode;

public class Solution {
    public boolean isMatch(String s, String p) {
		boolean[][] dp = new boolean[s.length()+1][p.length()+1];
		dp[0][0] = true;
		for(int i=0; i<s.length(); i++){
			dp[i+1][0] = false;
		}
		for(int j=0; j<p.length(); j++){
			if(j>0 && p.charAt(j) == '*'){
				dp[0][j+1] = dp[0][j-1];
			}else{
				dp[0][j+1] = false;
			}
		}
		for(int i=0; i<s.length(); i++){
			for(int j=0; j<p.length(); j++){
				if(p.charAt(j) == s.charAt(i)||p.charAt(j)=='.'){
					dp[i+1][j+1] = dp[i][j];
				}else if(p.charAt(j)=='*' && j>0){
					if(p.charAt(j-1)==s.charAt(i) || p.charAt(j-1) == '.'){
						dp[i+1][j+1] = dp[i][j+1] || dp[i][j-1];
					}
					dp[i+1][j+1] = dp[i+1][j+1] || dp[i+1][j-1];
				}
			}
		}
		return dp[s.length()][p.length()];
	}
}