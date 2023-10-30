import java.util.*;

class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        List<Character> charsWithOutSymbols = new ArrayList<Character>();

        for(int i=0;i<s.length();i++){

            Character charToCompare = s.charAt(i);

            if(charToCompare>='a' && charToCompare<='z' || charToCompare>='0' && charToCompare<='9'){
                charsWithOutSymbols.add(charToCompare);
            }
        }

        int startPointer = 0;
        int endPointer = charsWithOutSymbols.size()-1;

        while(startPointer<=endPointer){
            if(charsWithOutSymbols.get(startPointer) == charsWithOutSymbols.get(endPointer)){
                startPointer++;
                endPointer--;
                continue;
            }else{
                return false;
            }
        }

        return true;
        
    }
}