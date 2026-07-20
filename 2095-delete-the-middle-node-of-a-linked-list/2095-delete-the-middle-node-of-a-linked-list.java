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
    public ListNode deleteMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        if(head == null || head.next == null){
            return null;
        }
        int count = 0;
        while(fast != null && fast.next != null){
            slow =  slow.next;
            fast = fast.next.next;
            count++;
        }
        ListNode temp = head;
        for(int i = 0;i<count-1;i++){
            temp = temp.next;
        }
        temp.next = slow.next;
        return head;
        
    }
}