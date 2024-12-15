package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> grayCode(int n) {
    	List<Integer> p = new ArrayList<Integer>();
    	int length=(int)Math.pow(2, (double)n);
    	
    	p.add(0);
    	for(int i=1; i<length; i++){
    		int k, temp=i;
    		for(k=0; k<n; k++){
    			if(temp%2==1){
    				break;
    			}else{
    				temp/=2;
    			}
    		}
    		// temp's use is change
    		temp=p.get(i-1)/(int)Math.pow(2, (double)k);
    		if(temp%2==1){
    			p.add(p.get(i-1)-(int)Math.pow(2, (double)k));
    		}else{
    			p.add(p.get(i-1)+(int)Math.pow(2, (double)k));
    		}
    	}
    	return p;
    }
}