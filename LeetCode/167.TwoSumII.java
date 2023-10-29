class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int start = 0;
        int end = numbers.length - 1;
        int[] indices = new int[]{-1,-1};

        while(end>start){

            if(numbers[start] + numbers[end] == target){
                indices[0] = start+1;
                indices[1] = end+1;
                return indices;
            }
            else if(numbers[start] + numbers[end] > target){
                end--;
            }else{
                start++;
            }

        }
        return indices;
    }
}