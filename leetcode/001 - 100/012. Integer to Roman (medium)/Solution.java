package leetcode;

public class Solution {
    public String intToRoman(int num) {
        String p = new String();
        
        switch(num/1000){
            case 1: p+="M";
                break;
            case 2: p+="MM";
                break;
            case 3: p+="MMM";
                break;
        }
        
        switch((num%1000)/100){
            case 1: p+="C";
                break;
            case 2: p+="CC";
                break;
            case 3: p+="CCC";
                break;
            case 4: p+="CD";
                break;
            case 5: p+="D";
                break;
            case 6: p+="DC";
                break;
            case 7: p+="DCC";
                break;
            case 8: p+="DCCC";
                break;
            case 9: p+="CM";
                break;
        }
        
        switch((num%100)/10){
            case 1: p+="X";
                break;
            case 2: p+="XX";
                break;
            case 3: p+="XXX";
                break;
            case 4: p+="XL";
                break;
            case 5: p+="L";
                break;
            case 6: p+="LX";
                break;
            case 7: p+="LXX";
                break;
            case 8: p+="LXXX";
                break;
            case 9: p+="XC";
                break;
        }
        
        switch(num%10){
            case 1: p+="I";
                break;
            case 2: p+="II";
                break;
            case 3: p+="III";
                break;
            case 4: p+="IV";
                break;
            case 5: p+="V";
                break;
            case 6: p+="VI";
                break;
            case 7: p+="VII";
                break;
            case 8: p+="VIII";
                break;
            case 9: p+="IX";
                break;
        }
        
        return p;
    }
}
