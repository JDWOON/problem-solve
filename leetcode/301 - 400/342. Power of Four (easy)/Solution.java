package leetcode;

public class Solution {
    public boolean isPowerOfFour(int num) {
		if(num<1){
			return false;
		}else if(num==1){
			return true;
		}else{
			while(num>1){
				if(num%4!=0){
					return false;
				}
				num = num/4;
			}
			return true;
		}
        
    }
}