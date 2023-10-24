package easy;


import java.util.*;

class TwoSum2 {
  public static int[] twoNumberSum(int[] array, int targetSum) {

    Map<Integer,Integer> hashTable = new HashMap<>();

    for(int i=0; i<array.length; i++){

      int numberNeeded = targetSum - array[i];

      if(hashTable.containsKey(numberNeeded)){
        return new int[]{array[i], numberNeeded};
      }

      else{
        hashTable.put(array[i],i);
      } 
    }

    return new int[]{};
  }
}
