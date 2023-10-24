import 'dart:math';

class Solution {
  int maxSubArray(List<int> nums) {
    int sum = 0;
    int maxNum = nums[0];

    for (int element in nums) {
      sum += element;
      maxNum = max(sum, maxNum);
      sum = sum < 0 ? 0 : sum;
    }

    return maxNum;
  }
}
