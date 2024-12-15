package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<List<Integer>> generate(int n) {
		List<List<Integer>> p = new ArrayList<List<Integer>>();
		List<Integer> k = new ArrayList<Integer>();
        int[][] result = new int[n][n];
        
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    result[i][j]=1;
                    k.add(1);
                }else{
                    result[i][j]=result[i-1][j-1]+result[i-1][j];
                    k.add(result[i][j]);
                }
            }
            p.add(k);
            k = new ArrayList<Integer>();
        }
        return p;
	}
}