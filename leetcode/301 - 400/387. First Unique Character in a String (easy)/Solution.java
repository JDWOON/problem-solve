package leetcode;

public class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==1){
            return 0;
        }
        for(int i=0; i<s.length(); i++){
            int j;
            for(j=0; j<s.length(); j++){
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    break;
                }
            }
            if(j==s.length()){
                return i;
            }
        }
        return -1;
    }
}