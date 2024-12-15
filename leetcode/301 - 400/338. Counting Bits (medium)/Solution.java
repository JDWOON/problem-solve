package leetcode;

public class Solution {
    public int[] countBits(int num) {
        int p[] = new int[num+1];
        for(int i=0; i<num+1; i++){
            p[i]=0;
            for(int j=i; j>0; j/=2){
                if(j%2==1){
                    p[i]++;
                }
            }
        }
        return p;
    }
}