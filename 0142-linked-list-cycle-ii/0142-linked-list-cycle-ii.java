
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode ans = head;
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null){
            return null;
        }
       while(fast != null && fast.next != null){
        fast = fast.next.next;
        slow = slow.next;
        if(slow == fast){
            while(ans!=slow){
                slow = slow.next;
                ans = ans.next;
            }
            return ans;
          
        }
     
        } 
        return null;     
        
    }
}