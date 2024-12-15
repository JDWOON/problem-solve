package leetcode;

import java.util.Arrays;

public class Solution {
    public int longestPalindrome(String s) {
        int[] arr = new int[52];
        Arrays.fill(arr, 0);
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);
            if((int)ch>96){
                arr[(int)ch-71]++;
            }else{
                arr[(int)ch-65]++;
            }
        }
        
        int result=0;
        boolean alone=false;
        for(int i=0; i<52; i++){
            result+=arr[i] - (arr[i]%2);
            if(alone==false && arr[i]%2==1){
                result++;
                alone=true;
            }
        }
        return result;
    }
}