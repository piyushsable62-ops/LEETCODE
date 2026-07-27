
class Solution {
    public ListNode removeNodes(ListNode head) {
        if(head == null)
        return null;
        ListNode head1 = reverse(head);
        ListNode temp = head1;
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ans.next = temp;
        ans = temp;
        int max = temp.val;
        temp = temp.next;
        while(temp!=null){
            if(temp.val>=max){
                max = temp.val;
                ans.next = temp;
                ans = temp;
            }
            temp = temp.next;

        }
        ans.next = null;
        return (reverse(dummy.next));

        
        
    }
    public ListNode reverse(ListNode head){
        ListNode c = head;
        ListNode f = head;
        ListNode t = null;
        while(c!=null){
            f = c.next;
            c.next = t;
            t = c;
            c =f;

        }
        return t;
    }
}