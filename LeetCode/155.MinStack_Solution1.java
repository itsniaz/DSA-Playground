import java.util.*;
class MinStack {

    List<Integer> nums  = new ArrayList<Integer>(); 
    int min = Integer.MAX_VALUE;
    int top = 0;

    public MinStack() {
        
    }
    
    public void push(int val) {
        nums.add(val);
        top = val;
        if(val<min){
            min = val;
        }
    }
    
    public void pop() {
        nums.remove(nums.size()-1);
        min = Integer.MAX_VALUE;
        for(int num : nums){
            if(num<min){
                min = num;
            }
        }
    }
    
    public int top() {
       return nums.get(nums.size()-1);
    }
    
    public int getMin() {
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */