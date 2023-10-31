class MinStack {

    Node head;

    private class Node {

    int val;
    int min;
    Node previous;

        Node(int val,int min,Node previous){
            this.val = val;
            this.min = min;
            this.previous = previous;
        }
    }


    public MinStack() {

    }

    public void push(int val) {

        if(head == null){
            head = new Node(val,val,null);
        }
        else{
            int min = Math.min(head.min, val);
            head = new Node(val,min,head);
        }

    }

    public void pop() {
        head = head.previous;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {

        return  head.min;
    }
}
