import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        if(nums.length<3){
            return new ArrayList<List<Integer>>();
        }

        HashSet<List<Integer>> listOfNums = new HashSet<>();
        Arrays.sort(nums);

        for(int i=0; i<nums.length;i++){
            int firstNum = nums[i];
            int target = firstNum>0?firstNum*1:firstNum*-1;

            int startIndex = i+1;
            int endIndex = nums.length-1;

            while(endIndex>startIndex){

                int secondNum = nums[startIndex];
                int thirdNum = nums[endIndex];
                int sum = secondNum + thirdNum;

                if(sum == target){
                    listOfNums.add(Arrays.asList(firstNum,secondNum,thirdNum));
                    endIndex--;
                }
                else if(sum<target){
                    startIndex++;
                }else{
                    endIndex--;
                }
            }

        }

        return new ArrayList(listOfNums);
        
    }
}