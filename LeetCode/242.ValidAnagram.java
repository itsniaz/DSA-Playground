class Solution {
    public boolean isAnagram(String s, String t) {

        char[] countArray = new char[26];

        for(int i=0;i<s.length();i++){
            countArray[(int)s.charAt(i) -'a']++;
        }


        for(int i=0;i<t.length();i++){
            countArray[(int)t.charAt(i) -'a']--;
        }

        for(int i=0;i<countArray.length;i++){
            if(countArray[i]>0){
                return false;
            }
        }
        
        return true;
    }
}