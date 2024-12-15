package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public boolean isHappy(int n) {
        int p = n;
        List<Integer> list = new ArrayList<Integer>();
        while(p!=1){
        	list.add(p);
        	int cal=0;
        	for(int i=p; i>0; i=i/10){
        		cal += (i%10) * (i%10);
        	}
        	p=cal;
        	if(list.indexOf(p)>=0){
        		return false;
        	}
        }
        return true;
        
    }
}