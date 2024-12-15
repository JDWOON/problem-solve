package leetcode;

public class Solution {
    public int myAtoi(String str) {
    	boolean minus = false;
    	int strIndex=0;
    	long p = 0;
    	str = str.trim();
    	
    	if(str.length()<1){
    		return 0;
    	}else if(str.charAt(strIndex)=='-'){
    		minus = true;
    		strIndex++;
    	}else if(str.charAt(strIndex)=='+'){
    		strIndex++;
    	}
    	
    	while(strIndex < str.length()){
    		if((int)str.charAt(strIndex) < 58 && (int)str.charAt(strIndex) > 47){
    			if(minus){
    				p = p*10 - ((int)str.charAt(strIndex)-48);
    				if(p<Integer.MIN_VALUE){
    					p=Integer.MIN_VALUE;
    					break;
    				}
    			}else{
    				p = p*10 + ((int)str.charAt(strIndex)-48);
    				if(p>Integer.MAX_VALUE){
    					p=Integer.MAX_VALUE;
    					break;
    				}
    			}
    		}else{
    			break;
    		}
    		strIndex++;
    	}
    	
    	return (int)p;
    }
}