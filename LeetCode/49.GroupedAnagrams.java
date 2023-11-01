import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> groupedMap = new HashMap<>();

        for(String word :  strs){
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sortedWord = new String(chars);

            groupedMap.putIfAbsent(sortedWord, new ArrayList<>());
            groupedMap.get(sortedWord).add(word);

        }

        return new ArrayList<>(groupedMap.values());

    }
}
