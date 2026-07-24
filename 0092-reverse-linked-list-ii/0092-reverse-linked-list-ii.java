
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftprev = null;
        ListNode l = head;
        ListNode r = head;
        ListNode rightnext = head;
        for(int i = 1;i<left;i++){
            l = l.next;
        }
        if (left != 1) {
        leftprev = head;
        for (int i = 1; i < left - 1; i++) {
            leftprev = leftprev.next;
       }
    }
        for(int i = 1;i<right;i++){
            r = r.next;     
        }
        rightnext = r.next;   
        if(leftprev !=null){
            leftprev.next = null;
        }
        r.next = null;
        ListNode tail = l;
        ListNode rev = reverse(l);
        tail.next = rightnext;
        if (leftprev != null) {
        leftprev.next = rev;
        } else {
        head = rev;
        }
        return head;

    }
    public ListNode reverse(ListNode head){
     ListNode c = head;
     ListNode f = head;
     ListNode t = null;
     while(c!=null){
        f = c.next;
        c.next = t;
        t = c;
        c = f;
     }
     return t;
    }
}