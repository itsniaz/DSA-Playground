public class Solution {
    public boolean hasCycle(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null) return false;

        ListNode tortoise = head.next;
        ListNode hare = head.next.next;


        while(hare!=null && hare.next!=null){
            if(hare == tortoise){
                return true;
            }
            tortoise = tortoise.next;
            hare = hare.next.next;
        }

        return false;
    }
}