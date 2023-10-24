class Solution {
  List<int> plusOne(List<int> digits) {
  
      int carry = 1;
      for(int i = digits.length-1 ; i>=0; i--){

        int sum = digits[i] + carry;

        if(sum >9){
            digits[i] = sum%10;
            carry = (sum/10).toInt();
        }
        else{
            digits[i] = sum;
            carry = 0;
        }
      }

      if(carry == 1){
          return [carry,...digits];
      }

      return digits;
  }
}