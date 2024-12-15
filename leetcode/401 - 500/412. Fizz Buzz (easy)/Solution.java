package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> p = new ArrayList<String>();
        for(int i=1; i<n+1; i++){
            String s = new String();
            if(i%3==0){
                s += "Fizz";
            }
            if(i%5==0){
                s += "Buzz";
            }
            if(i%3!=0 && i%5!=0){
                s = Integer.toString(i);
            }
            p.add(s);
        }
        return p;
    }
}