
class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode head1 = slow.next;
        slow.next = null;
        head1 = reverse(head1);
        ListNode i = head;
        ListNode j = head1;
        ListNode t = head;
        while(j != null){
            i = i.next;
            t.next = j;
            t = j;
            j = j.next;
            t.next = i;
            t = i;
        }
        if(i!= null){
            t = i.next;
        }
        
    }
    public  ListNode reverse(ListNode head){
        
        ListNode t = null;
        ListNode i = head;
        ListNode j = head;
        while(i != null){
            j = i.next;
            i.next = t;
            t = i;
            i = j;

        }
        return t;

    }
}