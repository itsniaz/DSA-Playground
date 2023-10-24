class ProductOfArrayExceptSelf {
  List<int> productExceptSelf(List<int> nums) {
    int len = nums.length;
    List<int> productList = List.filled(len, 1);

    //Left Pass
    for (int i = 1; i < len; i++) {
      productList[i] = productList[i - 1] * nums[i - 1];
    }

    int rightProd = nums.last;
    //Right Pass
    for (int i = len - 2; i >= 0; i--) {
      productList[i] *= rightProd;
      rightProd *= nums[i];
    }

    return productList;
  }
}
