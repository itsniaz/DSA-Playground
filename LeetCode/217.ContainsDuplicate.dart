import 'dart:collection';

class ContainsDuplicate {
  bool containsDuplicate(List<int> nums) {
    HashMap counterHashMap = HashMap<int, bool>();

    for (int i = 0; i < nums.length; i++) {
      int numberInQuestion = nums[i];

      if (counterHashMap.containsKey(numberInQuestion)) {
        return true;
      } else {
        counterHashMap[numberInQuestion] = false;
      }
    }

    return false;
  }
}
