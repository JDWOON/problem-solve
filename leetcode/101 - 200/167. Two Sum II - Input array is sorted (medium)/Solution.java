package leetcode;

public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int k;
        int[] p = {0, 0};
        for(k=0; numbers[k]<target/2 && k<numbers.length; k++){ }
        for(int i=0; i<numbers.length-1; i++){
            for(int j=i+1; j<numbers.length; j++){
                if((numbers[i] + numbers[j]) == target){
                    p[0]=i+1;
                    p[1]=j+1;
                    return p;
                }
            }
            if(i>0 && numbers[i]==numbers[i-1]){
                while(i<numbers.length-1 && numbers[i]==numbers[i+1]){
                    i++;
                }
            }
        }
        return p;
    }
}