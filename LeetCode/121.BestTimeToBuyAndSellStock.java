class Solution {
    public int maxProfit(int[] prices) {

        int leftPointer = 0;
        int maxP = 0;

        for(int rightPointer=1; rightPointer<prices.length;rightPointer++){

            if(prices[rightPointer]>prices[leftPointer]){
                int profit  = prices[rightPointer] - prices[leftPointer];

                if(profit>maxP){
                    maxP = profit;
                }
            }
            else{
                leftPointer = rightPointer;
            }

        }

        return maxP;
    }
}