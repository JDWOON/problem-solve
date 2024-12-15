package leetcode;

public class Solution {
    public int superPow(int a, int[] b) {
    	int val_b=0, p=1, k;
        for(int i=0; i<b.length; i++){
            val_b=val_b*10 + b[i];
        }
        a=a%1337;
        k=a;
        for(int i=0; i<1337; i++){
            p=p*a%1337;
            if(p==k && i!=0){
            	k=i;
            	break;
            }
        }
        int temp=bigmod(a, b, k);
        System.out.println(temp);
        p=1;
        for(int i=0; i<temp; i++){
        	p=p*a%1337;
        }	
        return p;
    }
    public static int bigmod(int a, int[] b, int k){
    	int temp=0;
    	for(int i=0; i<b.length/5; i++){
    		for(int j=0; j<5; j++){
        		temp=temp*10+b[i*5+j];	
    		}
    		temp=temp%k;
    	}
    	for(int i=b.length-b.length%5; i<b.length; i++){
    		temp=temp*10+b[i];
    	}
    	
    	return temp;
    }
}