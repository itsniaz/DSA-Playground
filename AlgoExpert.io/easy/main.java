package easy;

public class main {
    
    public static void main(String[] args){
        TwoSum2 twoSum1 = new TwoSum2();
        int[] result = twoSum1.twoNumberSum(new int[]{1,2,12,51,2,31,3,7,9}, 58);
        System.out.println(String.format("[%s,%s]", result[0],result[1]));
    }


}
