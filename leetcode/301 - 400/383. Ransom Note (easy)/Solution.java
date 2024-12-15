package leetcode;

// too slow.
public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0; i<ransomNote.length(); i++){
            String temp = Character.toString(ransomNote.charAt(i));
            if(magazine.contains(temp)){
                magazine = magazine.replaceFirst(temp, "");
            }else{
                return false;
            }
        }
        return true;
    }
}