/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head == null || head.next == null){
            return null;
        }
        int count = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            count++;
        }
        if(n == count){
          ListNode temp1 = head;
          head = head.next;
          temp1.next = null;
          return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        for(int i = 0;i<n;i++){
            fast = fast.next;
        
        }
        while(fast.next != null){
             fast = fast.next;
               slow = slow.next;
         }
        slow.next = slow.next.next;
        return head;
        
    }
}