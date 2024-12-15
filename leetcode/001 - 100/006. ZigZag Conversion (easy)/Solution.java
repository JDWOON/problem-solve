package leetcode;

public class Solution {
    public String convert(String s, int numRows) {
    	char[] p = new char[s.length()];
    	int index=0;
    	if(numRows==1){
    		return s;
    	}
    	for(int i=0; i<numRows; i++){
    		for(int j=i; j<s.length(); j=j+(numRows*2)-2){
        		p[index]=s.charAt(j);
        		index++;
        		if(i!=0 && i!=numRows-1){
        			int k=2*(numRows-i-1)+j;
        			if(k<s.length()){
        				p[index]=s.charAt(k);
        				index++;
        			}
        		}
    		}

    	}
    	return new String(p);
    }
}