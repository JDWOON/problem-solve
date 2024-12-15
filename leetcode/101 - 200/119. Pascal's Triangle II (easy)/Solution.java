package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> p = new ArrayList<Integer>();
        int[][] a = new int[rowIndex+1][rowIndex+1];
        for(int i=0; i<rowIndex+1; i++){
            for(int j=0; j<i+1; j++){
                if(j==0 || j==i){
                    a[i][j]=1;
                }else{
                    a[i][j]=a[i-1][j-1]+a[i-1][j];
                }
            }
        }
        for(int i=0; i<rowIndex+1; i++){
            p.add(a[rowIndex][i]);
        }
        return p;
    }
}