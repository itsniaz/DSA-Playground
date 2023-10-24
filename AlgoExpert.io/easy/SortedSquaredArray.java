package easy;
import java.util.*;

class SortedSquaredArray {
    public int[] sortedSquaredArray(int[] array) {

        int[] squaredArray = new int[array.length];
        int len = array.length;

        int startPointer = 0;
        int endPointer = len-1;
        int outputIndex = len-1;

        while (outputIndex>=0){

            int startPointerNum = Math.abs(array[startPointer]);
            int endPointerNum = Math.abs(array[endPointer]);

            if(startPointerNum > endPointerNum){
                squaredArray[outputIndex] = startPointerNum * startPointerNum;
                startPointer++;
            }else{
                squaredArray[outputIndex] = endPointerNum * endPointerNum;
                endPointer--;
            }

            outputIndex--;
        }



        return  squaredArray;

    }
} {
    
}
