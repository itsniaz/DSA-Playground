class TwoSum {
  List<int> twoSum(List<int> nums, int target) {
    Map<int, int> numsMap = {};

    for (int i = 0; i < nums.length; i++) {
      int neededNum = target - nums[i];
      if (numsMap.containsKey(neededNum)) {
        return [i, numsMap[neededNum]!];
      } else {
        numsMap[nums[i]] = i;
      }
    }
    return [];
  }
}
