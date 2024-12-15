package leetcode;

public class Solution {
    public int romanToInt(String s) {
        int p=0;
		char now, next;
		for(int i=0; i<s.length(); i++){
			now=s.charAt(i);
			
			if(i<s.length()-1){
				next=s.charAt(i+1);
			}else{
				next='?';
			}
			
			if(now=='M'){
				p+=1000;
			}else if(now=='D'){
				p+=500;
			}else if(now=='C' && next=='M'){
				p+=900;
				i++;
			}else if(now=='C' && next=='D'){
				p+=400;
				i++;
			}else if(now=='C'){
				p+=100;
			}else if(now=='L'){
				p+=50;
			}else if(now=='X' && next=='C'){
				p+=90;
				i++;
			}else if(now=='X' && next=='L'){
				p+=40;
				i++;
			}else if(now=='X'){
				p+=10;
			}else if(now=='V'){
				p+=5;
			}else if(now=='I' && next=='X'){
				p+=9;
				i++;
			}else if(now=='I' && next=='V'){
				p+=4;
				i++;
			}else if(now=='I'){
				p+=1;
			}
		}
        return p;
    }
}