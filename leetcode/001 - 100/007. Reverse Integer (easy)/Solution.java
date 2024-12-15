package leetcode;

public class Solution {
    public int reverse(int x) {
    	int len = 0;
    	for(int i=x; i!=0; len++){
    		i = i/10;
    	}
    	long p=0;
		int temp=1;
    	for(int i=0; i<len; i++){
    		// (long) is slower than just use as int
    		// p = p*10 + ((x/temp)%10); // this works well
    		p = p*10 + (long)((x/temp)%10);
			temp *= 10;
    	}
    	if(p<(long)Integer.MIN_VALUE || p>(long)Integer.MAX_VALUE){
    		p=0;
    	}
    	return (int)p;
    }
}