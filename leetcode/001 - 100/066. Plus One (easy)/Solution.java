package leetcode;

import java.util.Arrays;

public class Solution {
    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1; i>-1; i--){
            digits[i]++;
            if(digits[i]<10){
                break;
            }
            digits[i]=digits[i]%10;
        }
        if(digits[0]%10==0){
            digits = new int[digits.length+1];
            Arrays.fill(digits, 0);
            digits[0]=1;
        }
        return digits;
    }
}