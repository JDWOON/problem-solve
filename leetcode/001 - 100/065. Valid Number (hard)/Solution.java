package leetcode;

public class Solution {
    public boolean isNumber(String s) {
        s=s.trim();
        int dot=0, e=0, num=0, sign=0;
        for(int i=0; i<s.length(); i++){
            if((int)s.charAt(i)==43 || (int)s.charAt(i)==45){
                if(num==0 && dot==0){
                    sign++;
                }else{
                    return false;
                }
            }else if((int)s.charAt(i)<58 && (int)s.charAt(i)>47){
        	    num++;
        	}else if((int)s.charAt(i)==46 && e==0){
        		if(s.length()>1 && e<1 && dot==0){
        			dot++;
        		}else{
        			return false;
        		}
        	}else if((int)s.charAt(i)==101){
        	    if(num<1 || i==s.length()-1){
        	        return false;
        	    }
        	    e++;
        	    sign=0;
        	    num=0;
        	    dot=0;
        	}else{
        		return false;
        	}
        }
        if(dot>1 || e>1 || num<1 || sign>1){
        	return false;
        }else{
        	return true;
        }
    }
}