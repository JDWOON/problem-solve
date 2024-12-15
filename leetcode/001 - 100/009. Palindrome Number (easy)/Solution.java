package leetcode;

public class Solution {
    public boolean isPalindrome(int x) {
        int y=0;
        for(int i=x; i>0; i=i/10){
            y=y*10 + i%10;
        }
        if(x==y){
            return true;
        }else{
            return false;
        }
    }
}