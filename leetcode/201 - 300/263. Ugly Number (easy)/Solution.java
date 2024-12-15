package leetcode;

public class Solution {
    public boolean isUgly(int num) {
        if(num==0){
            return false;
        }else{
            while(num%2==0){
                if(num%2!=0){
                    break;
                }else{
                    num/=2;
                }
            }
            while(num%3==0){
                if(num%3!=0){
                    break;
                }else{
                    num/=3;
                }
            }
            while(num%5==0){
                if(num%5!=0){
                    break;
                }else{
                    num/=5;
                }
            }
            if(num==1){
                return true;
            }else{
                return false;
            }
        }
    }
}