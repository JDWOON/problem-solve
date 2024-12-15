package leetcode;

public class Solution {
    public int integerBreak(int n) {
        if(n<6){
            int k=n/2;
            return (n-k)*k;
        }else if(n%3==0){
            return (int)Math.pow(3, (double)n/3);
        }else if(n%3==1){
            return (int)Math.pow(3, (double)((n-1)/3-1))*4;
        }else if(n%3==2){
            return (int)Math.pow(3, (double)(n-2)/3)*2;
        }else{
            return -1;
        }
    }
}