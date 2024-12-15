package leetcode;

// too slow. try to more fast.
public class Solution {
    public String getHint(String secret, String guess) {
        int a=0, b=0;
        for(int i=0; i<secret.length(); i++){
            if(secret.charAt(i) == guess.charAt(i)){
                a++;
            }
        }
        for(int i=0; i<secret.length(); i++){
            for(int j=0; j<guess.length(); j++){
                if(secret.charAt(i) == guess.charAt(j)){
                    secret = secret.replaceFirst(Character.toString(secret.charAt(i)), "s");
                    guess = guess.replaceFirst(Character.toString(guess.charAt(j)), "g");
                    b++;
                }
            }
        }
        b = b - a;
        return a+"A"+b+"B";
    }
}