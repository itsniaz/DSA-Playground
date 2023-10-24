package easy;
import java.util.*;

class ValidateSubsequence {
  public static boolean isValidSubsequence(
    List<Integer> array, List<Integer> sequence
  ) {
        int j = 0, i = 0;
        
        while(i<array.size() && j<sequence.size()){
            if(sequence.get(j) == array.get(i)){
                j++;
            }
          i++;
        }
        
        if(j == sequence.size()){
            return true;
        }

        return  false;
  }
}
