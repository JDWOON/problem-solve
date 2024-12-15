package leetcode;

public class Solution {
    public int addDigits(int num) {
        int digit, p=0;
        digit=(int)Math.log10((double)num)+1;
        for(int i=0; i<digit; i++){
            p+=num%10;
            num/=10;
        }
        if(p>9){
            return addDigits(p);
        }else{
            return p;
        }
    }
}